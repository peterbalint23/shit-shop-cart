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
    public void addToCart(int userId, int productId){
        Cart cart = cartRepository.findByUserId(userId);
        cart.getProducts().add(productId);
        cartRepository.save(cart);
    }

    @Transactional
    public List<Integer> findCartByUserId(int userId){
        Cart cart = cartRepository.findByUserId(userId);
        List<Integer> products = cart.getProducts();
        return products;
    }
}

