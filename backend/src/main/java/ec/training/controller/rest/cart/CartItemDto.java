package ec.training.controller.rest.cart;

import java.math.BigDecimal;

/**
 * カートの商品DTO
 */
public record CartItemDto(Long id, String name, String category, String description, BigDecimal price,
        Integer quantity) {

    CartItemDto(final CartItem item) {
        this(item.product().id(), item.product().name(), item.product().category(), item.product().description(),
                item.product().price(), item.quantity());

    }
}
