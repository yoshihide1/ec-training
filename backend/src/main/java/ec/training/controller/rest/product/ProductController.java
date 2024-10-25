package ec.training.controller.rest.product;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.training.constant.ApiConstants;

@RestController
@RequestMapping(ApiConstants.BASE_PATH + "/product")
public class ProductController {

    private final ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public List<ProductDto> getList() {
        return productService.getAllProducts();
    }

}
