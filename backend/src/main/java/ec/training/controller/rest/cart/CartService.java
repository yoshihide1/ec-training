package ec.training.controller.rest.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.training.controller.rest.product.ProductRepository;

@Service
public class CartService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    public Cart add(final Long productId, final Integer userId) {// TODO LoginAuthなどに変更する
        var product = productRepository.selectProduct(productId);
        // TODO: 仮で固定、SpringSecurity実装後に修正する
        var cartItems = cartItemRepository.selectCartItems(userId);
        var cart = new Cart(cartItems);
        cartItemRepository.saveItems(userId, cart);
        return cart.add(product);

    }
}
