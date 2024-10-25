package ec.training.controller.rest.cart;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.training.entity.CartItemsEntity;

@Service
public class CartItemConvertService {

    /**
     * CartItem -> CartsEntityに変換する
     * 
     * @param id
     * @param list
     * @return List<CartsEntity>
     */
    public List<CartItemsEntity> toEntities(final Long id, final List<CartItem> cartItems) {
        return cartItems.stream().map(c -> {
            var entity = new CartItemsEntity();
            entity.setCartId(id);
            entity.setProductId(c.product().id());
            entity.setQuantity(c.quantity());
            return entity;
        }).toList();

    }

}
