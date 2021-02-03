package com.example.productdb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@NoArgsConstructor


public class Product {

    String productId;
    String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}