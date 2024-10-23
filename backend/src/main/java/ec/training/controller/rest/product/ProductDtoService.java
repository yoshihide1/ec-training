package ec.training.controller.rest.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * EntityからDTOに変換するためのサービス
 */
@Service
public class ProductDtoService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * 
     * @param productId
     * @return 単一の商品DTO
     */
    public ProductDto toDto(final Long productId) {
        var product = productRepository.getProductById(productId);
        return ProductDto.of(product);
    }

    /**
     * 
     * @return すべての商品を返す
     */
    public List<ProductDto> getAllProducts() {
        var products = productRepository.selectAllProduct();
        return products.stream().map(ProductDto::of).toList();
    }
}
