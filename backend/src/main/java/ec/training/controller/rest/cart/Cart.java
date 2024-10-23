package ec.training.controller.rest.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ec.training.controller.rest.product.Product;

public record Cart(List<CartItem> items) {

    /**
     * 商品をカートに追加する
     * 
     * @param product
     * @return
     */
    // TODO cartIdを持つべきか...
    public Cart add(final Product product) {

        var newItem = new CartItem(product);
        var updatedItems = new ArrayList<CartItem>(this.items);

        var newItemInCart = existsItem(newItem);
        if (newItemInCart.isPresent()) {
            updatedItems.remove(newItemInCart.get());// 不変にするためにあれば一旦削除する
            updatedItems.add(newItemInCart.get().increment());
        } else {
            updatedItems.add(newItem);
        }
        return new Cart(updatedItems);
    }

    /**
     * 
     * @param product
     * @return 同じ商品がカートにある場合はその商品を返す
     */
    private Optional<CartItem> existsItem(final CartItem newItem) {
        return this.items.stream().filter(item -> item.productId().equals(newItem.productId())).findFirst();

    }

    public int getItemCount() {
        return this.items.size();
    }

}