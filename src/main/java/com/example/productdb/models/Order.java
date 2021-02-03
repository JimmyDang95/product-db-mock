package com.example.productdb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Objects;

@Data
@NoArgsConstructor

public class Order {
    private String orderId;
    private ArrayList<Product> productList;

    public Order(String orderId, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.productList = productList;
    }
}
