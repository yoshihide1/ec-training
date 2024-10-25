package ec.training.controller.rest.cart;

import java.util.List;

/**
 * カートのDTO
 */
public record CartDto(List<CartItemDto> items, int itemCount) {

    CartDto(final Cart cart) {
        this(cart.items().values().stream()
                .map(CartItemDto::new)
                .toList(), cart.getItemCount());
    }

}
