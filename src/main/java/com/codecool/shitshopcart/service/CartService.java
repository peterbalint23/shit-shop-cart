package com.codecool.shitshopcart.service;

import com.codecool.shitshopcart.model.Cart;
import com.codecool.shitshopcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Transactional
    public void addToCart(long userId, long productId){
        if(cartRepository.findByUserId(userId) == null){
            cartRepository.save(new Cart(userId));
        }
        Cart cart = cartRepository.findByUserId(userId);

        cart.addProduct(productId);
        cartRepository.save(cart);

    }



}

