package ec.training.controller.rest.cart;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import ec.training.controller.rest.product.ProductRepository;
import ec.training.entity.CartItemsEntity;
import ec.training.entity.CartsEntity;
import ec.training.mapper.CartItemsEntityMapper;
import ec.training.mapper.CartsEntityMapper;

@Repository
public class CartRepository {

    private final CartsEntityMapper cartsEntityMapper;

    private final CartItemsEntityMapper cartItemsEntityMapper;

    private final ProductRepository productRepository;

    CartRepository(CartsEntityMapper cartsEntityMapper, CartItemsEntityMapper cartItemsEntityMapper,
            ProductRepository productRepository) {
        this.cartsEntityMapper = cartsEntityMapper;
        this.cartItemsEntityMapper = cartItemsEntityMapper;
        this.productRepository = productRepository;
    }

    /**
     * カートオブジェクトを取得する
     * 
     * @param userId
     * @return カートオブジェクト
     */
    public Cart findCartByUserId(final Long userId) {
        var cartEntity = fetchCartById(userId);
        var cartItems = cartItemsEntityMapper.selectByCartId(cartEntity.getId());

        var itemMap = new HashMap<Long, CartItem>();
        for (var item : cartItems) {
            var product = productRepository.findProductById(item.getProductId());
            itemMap.put(item.getProductId(), new CartItem(product, item.getQuantity()));
        }
        return new Cart(itemMap);

    }

    /**
     * カートをDBに保存する
     * 
     * @param userId
     * @param product
     */
    public void saveCart(final Long userId, final Cart cart) {
        var cartEntity = fetchCartById(userId);
        cartItemsEntityMapper.deleteCartItemsByCartId(cartEntity.getId());

        var items = cart.items().values().stream().map(item -> {
            var entity = new CartItemsEntity();
            entity.setCartId(cartEntity.getId());
            entity.setProductId(item.product().id());
            entity.setQuantity(item.quantity());
            return entity;
        }).toList();

        cartItemsEntityMapper.bulkInsert(items);
    }

    private CartsEntity fetchCartById(final Long userId) {
        var cartEntity = cartsEntityMapper.selectByUserId(userId);
        if (cartEntity.isEmpty()) {
            throw new RuntimeException("カートが存在しません");
        }
        return cartEntity.get();
    }

    /**
     * カート内の商品をすべて削除する
     */
    public void removeAll(final Long userId) {
        var cart = findCartByUserId(userId);
        if (cart.getItemCount() == 0) {
            throw new RuntimeException("カートに商品が存在しません");
        }
        var cartEntity = fetchCartById(userId);
        cartItemsEntityMapper.deleteCartItemsByCartId(cartEntity.getId());
    }

}
