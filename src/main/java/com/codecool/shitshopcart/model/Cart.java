package com.codecool.shitshopcart.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {

    @Id
    @GeneratedValue
    private int id;

    private int userId;

    @ElementCollection
    @CollectionTable(name = "Products")
    private List<Integer> products;

    public Cart() {
    }

    public Cart(int userId, List<Integer> products) {
        this.userId = userId;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Integer> getProducts() {
        return products;
    }

    public void setProducts(List<Integer> products) {
        this.products = products;
    }
}
