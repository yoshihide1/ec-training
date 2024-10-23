package ec.training.controller.rest.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ec.training.entity.CartItemsEntity;
import ec.training.entity.CartsEntity;
import ec.training.mapper.CartItemsEntityMapper;
import ec.training.mapper.CartsEntityMapper;

@Repository
public class CartRepository {

    @Autowired
    private CartsEntityMapper cartsEntityMapper;

    @Autowired
    private CartItemsEntityMapper cartItemsEntityMapper;

    /**
     * カートオブジェクトを取得する
     * 
     * @param userId
     * @return カートオブジェクト
     */
    public Cart getCartByUserId(Integer userId) {
        var cartEntity = fetchCartById(userId);
        var cartItemsEntity = cartItemsEntityMapper.selectCartItemsByCartId(cartEntity.getId());
        var cartItems = cartItemsEntity.stream().map(CartItem::new).toList();
        return new Cart(cartItems);

    }

    /**
     * カートをDBに保存する
     * 
     * @param userId
     * @param product
     */
    public void saveCart(Integer userId, Cart cart) {
        var cartEntity = fetchCartById(userId);
        cartItemsEntityMapper.deleteCartItemsByCartId(cartEntity.getId());

        var items = cart.items().stream().map(item -> {
            var entity = new CartItemsEntity();
            entity.setCartId(cartEntity.getId());
            entity.setProductId(item.productId());
            entity.setQuantity(item.quantity());
            return entity;
        }).toList();

        cartItemsEntityMapper.bulkInsert(items);
    }

    private CartsEntity fetchCartById(Integer userId) {
        var cartEntity = cartsEntityMapper.selectByUserId(userId);
        if (cartEntity.isEmpty()) {
            throw new RuntimeException("カートが存在しません");
        }
        return cartEntity.get();
    }

}
