package ec.training.controller.rest.product;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
class ProductService {

    private final ProductRepository productRepository;

    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * 
     * @param productId
     * @return 単一の商品
     */
    ProductDto getProduct(Long productId) {
        var product = productRepository.findProductById(productId);
        return new ProductDto(product);

    }

    /**
     * 
     * @return すべての商品を返す
     */
    List<ProductDto> getAllProducts() {
        var products = productRepository.findAllProduct();
        return products.stream().map(ProductDto::new).toList();
    }
}
