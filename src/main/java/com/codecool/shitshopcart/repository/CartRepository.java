package com.codecool.shitshopcart.repository;

import com.codecool.shitshopcart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CartRepository extends JpaRepository <Cart, Integer> {

    Cart findByUserId(int userId);
}
