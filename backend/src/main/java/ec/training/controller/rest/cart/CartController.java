package ec.training.controller.rest.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.training.constant.ApiConstants;

@RestController
@RequestMapping(ApiConstants.BASE_PATH + "/cart")
public class CartController {

    @Autowired
    private CartService service;

    @Transactional
    @PostMapping("/add")
    public Cart add(@RequestBody ProductAddFrom form) {
        return service.add(form.productId(), 1);

    }

}
