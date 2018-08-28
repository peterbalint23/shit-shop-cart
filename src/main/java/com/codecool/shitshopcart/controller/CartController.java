package com.codecool.shitshopcart.controller;

import com.codecool.shitshopcart.model.Cart;
import com.codecool.shitshopcart.repository.CartRepository;
import com.codecool.shitshopcart.service.CartService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @PostMapping("/cart/{user_id}/{product_id}")
    public void addToCart(@PathVariable("user_id") long user_id, @PathVariable("product_id") long product_id) {
        cartService.addToCart(user_id, product_id);
    }

    @GetMapping("/cart/{user_id}")
    public List<Long> getCartByUser_id(@PathVariable("user_id") long user_id){
        return cartService.findCartByUserId(user_id);
    }
}
