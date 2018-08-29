package com.codecool.shitshopcart.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart")
public class Cart {

    @Id
    @GeneratedValue
    private long id;

    private long userId;

    @ElementCollection
    @CollectionTable(name = "Products")
    private List<Long> products;

    public Cart() {
    }

    public Cart(long userId, List<Long> products) {
        this.userId = userId;
        this.products = products;
    }

    public Cart(long userId) {
        this.userId = userId;
        this.products = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<Long> getProducts() {

        return products;
    }

    public void addProduct(long productId) {
        products.add(productId);
    }


    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userId=" + userId +
                ", products=" + products +
                '}';
    }
}
