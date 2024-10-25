package ec.training.controller.rest.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * 初期表示 TODO ログイン時に取得するように変更すること！
     * 
     * @param param
     * @return
     */
    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable("id") Integer userId) {
        return cartRepository.getCartByUserId(userId);

    }

    @Transactional
    @PostMapping("/add")
    public Cart add(@RequestBody ProductFrom form) {
        return service.add(form.productId(), 1);

    }

    @Transactional
    @DeleteMapping("/remove/all")
    public Cart removeAll() {
        return service.clearCart(1);
    }

    @Transactional
    @PostMapping("/remove/{id}")
    public Cart removeOne(@PathVariable("id") Long productId) {
        return service.remove(productId, 1);
    }

}
