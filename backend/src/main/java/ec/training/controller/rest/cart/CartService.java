package ec.training.controller.rest.cart;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.training.controller.rest.product.ProductRepository;

/**
 * カートを操作するサービスクラス
 */
@Service
public class CartService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartRepository cartRepository;

    /**
     * 商品を追加する
     * 
     * @param productId
     * @param userId
     * @return 商品追加後のカート
     */
    public Cart add(final Long productId, final Integer userId) {// TODO LoginAuthなどに変更する
        var product = productRepository.selectProductById(productId);
        // TODO: 仮で固定、SpringSecurity実装後に修正する
        var cart = cartRepository.getCartByUserId(userId);
        var addedItemCart = cart.add(product);
        cartRepository.saveCart(userId, addedItemCart);
        return addedItemCart;
    }

    /**
     * 特定の商品を削除する
     * 
     * @param productId
     * @param userId
     * @return 商品削除後のカート
     */
    public Cart remove(final Long productId, final Integer userId) {
        var cart = cartRepository.getCartByUserId(userId);
        var deletedItemCart = cart.remove(productId);
        if (deletedItemCart.items().isEmpty()) {
            return clearCart(userId);
        }
        cartRepository.saveCart(userId, deletedItemCart);
        return deletedItemCart;
    }

    /**
     * カート内の商品をすべて削除する
     * 
     * @param userId
     * @return 空のカート
     */
    public Cart clearCart(final Integer userId) {
        cartRepository.removeAll(userId);
        return new Cart(new HashMap<>());
    }
}
