package com.example.productdb.service;

import com.example.productdb.db.ProductDb;
import com.example.productdb.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {

    private final ProductDb orderServiceProductDb;


    public ProductService(ProductDb orderServiceProductDb) {
        this.orderServiceProductDb = orderServiceProductDb;
    }

    public List<Product> getProductList(){

        return orderServiceProductDb.getProductList();
    }

    public Product addProduct(@RequestBody Product newProduct){

        return orderServiceProductDb.addProduct(newProduct);
    }
}
