package ec.training.controller.rest.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ec.training.mapper.ProductsEntityMapper;

/**
 * 商品リポジトリ
 */
@Repository
public class ProductRepository {

    @Autowired
    private ProductsEntityMapper productsEntityMapper;

    /**
     * 
     * @param productId
     * @return 対象の商品
     */
    public Product selectProductById(final Long productId) {
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
    public List<Product> selectAllProduct() {
        var products = productsEntityMapper.selectAll();

        return products.stream().map(Product::new).toList();
    }

}
