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
        obj.put("name", "Szabolcs");

        return obj;
    }

    @PostMapping("/cart/{user_id}/{productId}")
    public void addToCart(@PathVariable("user_id") int userId, @PathVariable("productId") int productId) {
        cartService.addToCart(userId, productId);
    }

    @GetMapping("/cart/{userId}")
    public Object getCartByUser_id(@PathVariable("userId") int userId){
        JSONObject cartListObject = new JSONObject();
        System.out.println(cartListObject.put("cartList", cartService.findCartByUserId(userId)));
        return cartListObject.put("cartList", cartService.findCartByUserId(userId));
    }
}
