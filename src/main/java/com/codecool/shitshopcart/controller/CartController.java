package com.codecool.shitshopcart.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartController {



        @GetMapping("/cart")
        public JSONObject getUser(){
            JSONObject obj = new JSONObject();
            obj.put("name", "Szabolcs");

            return obj;
        }

        @DeleteMapping("/cart/<user_id>/<product_id>")
        public void deleteFromCart(long product_id){
        }

}
