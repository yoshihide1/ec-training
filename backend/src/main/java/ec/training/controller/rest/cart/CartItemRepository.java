package ec.training.controller.rest.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ec.training.mapper.CartItemsEntityMapper;
import ec.training.mapper.CartsEntityMapper;

/**
 * カート内の商品
 */
@Repository
public class CartItemRepository {

    @Autowired
    private CartItemsEntityMapper cartItemsEntityMapper;

    @Autowired
    private CartsEntityMapper cartsEntityMapper;

    @Autowired
    private CartItemConvertService cartItemConvertService;

    public List<CartItem> selectCartItems(final Integer userId) {
        var cartItemsEntity = cartItemsEntityMapper.selectCartItemsByUserId(userId);
        // TODO カート内に商品がない場合にnullぽ
        return cartItemsEntity.stream().map(CartItem::new).toList();

    }

    /**
     * カート内の商品を保存する
     * 
     * @param userId
     * @param cart
     */
    public void saveItems(final Integer userId, final Cart cart) {
        var cartEntity = cartsEntityMapper.selectByUserId(userId);
        deleteCartItems(cartEntity.getId());
        var items = cartItemConvertService.toEntities(cartEntity.getId(), cart.items());
        cartItemsEntityMapper.bulkInsert(items);
    }

    /**
     * カート内の商品をすべて削除する
     * 
     * @param cartId
     */
    private void deleteCartItems(final Long cartId) {
        cartItemsEntityMapper.deleteCartItemsByCartId(cartId);
    }
}
