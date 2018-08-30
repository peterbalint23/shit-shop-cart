package com.codecool.shitshopcart.controller;

import com.codecool.shitshopcart.service.CartService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CartController {

    @Autowired
    private CartService cartService;


    private static JSONObject jsonObject = new JSONObject();


    @PostMapping("/cart/{userId}/{productId}")
    public void addToCart(@PathVariable("userId") int userId, @PathVariable("productId") int productId) {
        cartService.addToCart(userId, productId);
    }

    @GetMapping("/cart/{userId}")
    public Object getCartByUserId(@PathVariable("userId") int userId) {
        jsonObject.put("userId", userId);
        jsonObject.put("cartList", cartService.findCartByUserId(userId));
        return jsonObject;
    }

    @DeleteMapping("cart/{userId}/{productId}")
    public void deleteFromCart(@PathVariable("userId") int userId, @PathVariable("productId") int productId) {
        cartService.deleteFromCart(userId, productId);
    }

    @DeleteMapping("/cart/{userId}/delete")
    public void deleteCart(@PathVariable("userId") int userId) {
        cartService.deleteCart(userId);
    }
}
