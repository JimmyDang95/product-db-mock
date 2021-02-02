package com.example.productdb.service;

import java.util.ArrayList;
import java.util.List;

import com.example.productdb.db.ProductDb;
import com.example.productdb.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class OrderService {

    private final ProductDb orderServiceProductDb;


    public OrderService(ProductDb orderServiceProductDb) {
        this.orderServiceProductDb = orderServiceProductDb;
    }

    public List<Product> getProductList(){

        return orderServiceProductDb.getProductList();
    }

    public Product addProduct(@RequestBody Product newProduct){

        return orderServiceProductDb.addProduct(newProduct);
    }


}
