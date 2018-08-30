package com.codecool.shitshopcart.controller;

import com.codecool.shitshopcart.service.CartService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CartController {

    @Autowired
    private CartService cartService;



    @GetMapping("/cart")
    public JSONObject getUser() {
        JSONObject obj = new JSONObject();
        int array[] = {2,5};
        obj.put("userId", "1");
        obj.put("carList", array);

        return obj;
    }

    @PostMapping("/cart/{userId}/{productId}")
    public void addToCart(@PathVariable("userId") int userId, @PathVariable("productId") int productId) {
        cartService.addToCart(userId, productId);
    }

    @GetMapping("/cart/{userId}")
    public Object getCartByUserId(@PathVariable("userId") int userId){
        JSONObject cartListObject = new JSONObject();
        System.out.println(cartListObject.put("cartList", cartService.findCartByUserId(userId)));
        cartListObject.put("userId", userId);
        cartListObject.put("cartList", cartService.findCartByUserId(userId));
        return cartListObject;
    }

    @DeleteMapping("cart/{userId}/{productId}")
    public void deleteFromCart(@PathVariable("userId") int userId, @PathVariable("productId") int productId){
        cartService.deleteFromCart(userId, productId);
    }

    @DeleteMapping("/cart/{userId}/delete")
    public void deleteCart(@PathVariable("userId") int userId){
        cartService.deleteCart(userId);
    }
}
