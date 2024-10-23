package ec.training.controller.rest.cart;

import ec.training.controller.rest.product.Product;
import ec.training.entity.CartItemsEntity;

/**
 * カート内の商品を表す
 */
record CartItem(Long productId, Integer quantity) {

    CartItem(Product product) {
        this(product.id(), 1);
    }

    CartItem(final CartItemsEntity entity) {
        this(entity.getProductId(), entity.getQuantity());
    }

    /**
     * 
     * @return 商品の個数を一つ増やす
     */
    public CartItem increment() {
        return new CartItem(this.productId, this.quantity + 1);
    }
}
