package com.codecool.shitshopcart.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartController {



        @GetMapping("/car")
        public JSONObject getUser(){
            JSONObject obj = new JSONObject();
            obj.put("name", "Szabolcs");

            return obj;
        }

}
