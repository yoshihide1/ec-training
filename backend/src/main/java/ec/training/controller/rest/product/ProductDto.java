package ec.training.controller.rest.product;

import java.math.BigDecimal;

public record ProductDto(
        Long id,
        String category,
        String name,
        String description,
        BigDecimal price,
        Integer stockQuantity) {
    ProductDto(final Product product) {
        this(product.id(),
                product.category(),
                product.name(),
                product.description(),
                product.price(),
                product.stockQuantity());
    }
}
