package com.codecool.shitshopcart.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {

    @Id
    @GeneratedValue
    private long id;

    private long user_id;

    @ElementCollection
    @CollectionTable(name = "Products")
    private List<Long> products;

    public Cart() {
    }

    public Cart(long user_id, List<Long> products) {
        this.user_id = user_id;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public List<Long> getProducts() {
        return products;
    }

    public void setProducts(List<Long> products) {
        this.products = products;
    }
}
