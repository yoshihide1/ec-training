package ec.training.controller.rest.product;

import java.util.List;

import org.springframework.stereotype.Repository;

import ec.training.mapper.ProductsEntityMapper;

/**
 * 商品リポジトリ
 */
@Repository
public class ProductRepository {

    private final ProductsEntityMapper productsEntityMapper;

    ProductRepository(ProductsEntityMapper productsEntityMapper) {
        this.productsEntityMapper = productsEntityMapper;
    }

    /**
     * 
     * @param productId
     * @return 対象の商品
     */
    public Product findProductById(final Long productId) {
        var product = productsEntityMapper.selectByPrimaryKey(productId);
        if (product.isEmpty()) {
            throw new IllegalArgumentException("対象の商品は存在しません。");
        }
        return new Product(product.get());

    }

    /**
     * 
     * @return すべての商品
     */
    public List<Product> findAllProduct() {
        var products = productsEntityMapper.selectAll();
        if (products.isEmpty()) {
            throw new RuntimeException("商品がありません");
        }
        return products.stream().map(Product::new).toList();
    }

}
