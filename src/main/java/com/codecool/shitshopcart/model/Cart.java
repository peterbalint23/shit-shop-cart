package com.codecool.shitshopcart.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart")
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


    public Cart(int userId) {
        this.userId = userId;
        this.products = new ArrayList<>();
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


    public void addProduct(int productId) {
        products.add(productId);
    }

    public void deleteProduct(int productId) {
        if (products.contains(productId)) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i) == productId) {
                    products.remove(i);
                    break;
                }
            }
        }
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
