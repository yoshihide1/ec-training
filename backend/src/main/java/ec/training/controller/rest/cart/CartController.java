package ec.training.controller.rest.cart;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.training.constant.ApiConstants;

/**
 * カートを操作するコントローラ
 */
@RestController
@RequestMapping(ApiConstants.BASE_PATH + "/cart")
public class CartController {

    private final CartService cartService;

    CartController(CartService cartService) {
        this.cartService = cartService;

    }

    /**
     * 初期表示 TODO ログイン時に取得するように変更すること！
     * 
     * @param param
     */
    @GetMapping("/{id}")
    public CartDto getCart(@PathVariable("id") Long userId) {
        return cartService.getCart(userId);
    }

    @PostMapping("/add")
    public CartDto add(@RequestBody CartItemFrom form) {
        return cartService.add(form.productId(), 1L);

    }

    @DeleteMapping("/remove/all")
    public CartDto removeAll() {
        return cartService.clearCart(1L);
    }

    @PostMapping("/remove/{id}")
    public CartDto removeOne(@PathVariable("id") Long productId) {
        return cartService.remove(productId, 1L);
    }

}
