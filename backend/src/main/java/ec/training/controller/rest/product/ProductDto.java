package ec.training.controller.rest.product;

import java.math.BigDecimal;

public record ProductDto(
        Long id,
        String category,
        String name,
        String description,
        BigDecimal price,
        Integer stockQuantity) {
    public static ProductDto of(final Product product) {
        return new ProductDto(
                product.id(),
                product.category(),
                product.name(),
                product.description(),
                product.price(),
                product.stockQuantity());
    }
}
