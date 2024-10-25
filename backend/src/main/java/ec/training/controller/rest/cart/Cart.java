package ec.training.controller.rest.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ec.training.controller.rest.product.Product;

record Cart(Map<Long, CartItem> items) {

    /**
     * 商品をカートに追加する
     * 
     * @param product
     * @return
     */
    Cart add(final Product product) {
        var updatedItems = new HashMap<>(this.items);
        if (updatedItems.containsKey(product.id())) {
            var existingItem = updatedItems.get(product.id());
            updatedItems.put(product.id(), existingItem.increment());
        } else {
            var newItem = new CartItem(product);
            updatedItems.put(product.id(), newItem);
        }
        return new Cart(updatedItems);
    }

    /**
     * カート内の商品を一つ減らす
     * 
     * @param product
     * @return
     */
    public Cart remove(final Long productId) {
        var updatedItems = new HashMap<>(this.items);
        if (updatedItems.containsKey(productId)) {
            var existingItem = updatedItems.get(productId);
            if (existingItem.quantity() == 1) {
                updatedItems.remove(productId);
            } else {
                updatedItems.put(productId, existingItem.decrement());
            }
        }

        return new Cart(updatedItems);
    }

    public List<CartItem> getItems() {
        return new ArrayList<>(items.values());
    }

    public int getItemCount() {
        return this.items.size();
    }

}