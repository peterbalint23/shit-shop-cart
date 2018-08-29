package com.codecool.shitshopcart.repository;

import com.codecool.shitshopcart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository <Cart, Long> {

    Cart findByUserId(long userId);
}
