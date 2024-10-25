package ec.training.controller.rest.cart;

import ec.training.controller.rest.product.Product;

/**
 * カート内の商品を表す
 */
public record CartItem(Product product, int quantity) {

    public CartItem {
        if (quantity < 0) {
            throw new IllegalArgumentException("数量は0以上の必要があります");
        }
    }

    CartItem(final Product product) {
        this(product, 1);
    }

    /**
     * 
     * @return 商品の個数を一つ増やす
     */
    public CartItem increment() {
        return new CartItem(this.product, this.quantity + 1);
    }

    /**
     * 
     * @return 商品の個数を一つ減らす
     */
    public CartItem decrement() {
        return new CartItem(this.product, this.quantity - 1);
    }

}
