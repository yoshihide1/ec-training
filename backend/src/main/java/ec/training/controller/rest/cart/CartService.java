package ec.training.controller.rest.cart;

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

    public Cart add(final Long productId, final Integer userId) {// TODO LoginAuthなどに変更する
        var product = productRepository.getProductById(productId);
        // TODO: 仮で固定、SpringSecurity実装後に修正する
        var cart = cartRepository.getCartByUserId(userId);
        var addedItemCart = cart.add(product);
        cartRepository.saveCart(userId, addedItemCart);
        return cart.add(product);
    }
}
