package ec.training.controller.rest.product;

import java.math.BigDecimal;

import ec.training.entity.ProductsEntity;

/**
 * 商品
 */
public record Product(Long id, String category, String name, String description, BigDecimal price,
        Integer stockQuantity) {
    // TODO category, nameはクラス作成する？

    Product(final ProductsEntity entity) {
        this(entity.getId(), entity.getCategory(), entity.getName(), entity.getDescription(), entity.getPrice(),
                entity.getStockQuantity());
    }
}
