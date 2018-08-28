package com.codecool.shitshopcart.service;

import com.codecool.shitshopcart.model.Cart;
import com.codecool.shitshopcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Transactional
    public void addToCart(long user_id, long product_id){
        Cart cart = cartRepository.findByUser_id(user_id);
        cart.getProducts().add(product_id);
        cartRepository.save(cart);
    }

    @Transactional
    public List<Long> findCartByUserId(long user_id){
        Cart cart = cartRepository.findByUser_id(user_id);
        List<Long> products = cart.getProducts();
        return products;
    }
}

