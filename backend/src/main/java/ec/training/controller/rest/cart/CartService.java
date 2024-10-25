package ec.training.controller.rest.cart;

import java.util.Collections;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.training.controller.rest.product.ProductRepository;

/**
 * カートを操作するサービスクラス
 */
@Service
class CartService {

    private final ProductRepository productRepository;

    private final CartRepository cartRepository;

    CartService(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    /**
     * 
     * @param userId
     * @return カートを取得
     */
    CartDto getCart(final Long userId) {
        var cart = cartRepository.findCartByUserId(userId);
        return new CartDto(cart);
    }

    /**
     * 商品を追加する
     * 
     * @param productId
     * @param userId
     * @return 商品追加後のカート
     */
    @Transactional
    CartDto add(final Long productId, final Long userId) {// TODO LoginAuthなどに変更する
        var product = productRepository.findProductById(productId);
        // TODO: 仮で固定、SpringSecurity実装後に修正する
        var cart = cartRepository.findCartByUserId(userId);
        var addedItemCart = cart.add(product);
        cartRepository.saveCart(userId, addedItemCart);
        return new CartDto(addedItemCart);
    }

    /**
     * 特定の商品を削除する
     * 
     * @param productId
     * @param userId
     * @return 商品削除後のカート
     */
    @Transactional
    CartDto remove(final Long productId, final Long userId) {
        var cart = cartRepository.findCartByUserId(userId);
        var deletedItemCart = cart.remove(productId);
        if (deletedItemCart.items().isEmpty()) {
            return clearCart(userId);
        }
        cartRepository.saveCart(userId, deletedItemCart);
        return new CartDto(deletedItemCart);
    }

    /**
     * カート内の商品をすべて削除する
     * 
     * @param userId
     * @return 空のカート
     */
    @Transactional
    CartDto clearCart(final Long userId) {
        cartRepository.removeAll(userId);
        return new CartDto(Collections.emptyList(), 0);
    }
}
