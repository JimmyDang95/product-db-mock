package com.example.productdb.service;

import com.example.productdb.db.ProductDb;
import com.example.productdb.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductDb orderServiceProductDb;


    public ProductService(ProductDb orderServiceProductDb) {
        this.orderServiceProductDb = orderServiceProductDb;
    }

    public List<Product> getProductList() {

       return orderServiceProductDb.getProductList();
    }

    public Product addProduct(@RequestBody Product newProduct) {

        return orderServiceProductDb.addProduct(newProduct);
    }

    public List<Product> searchProducts(String search) {
        ArrayList<Product> searchList = new ArrayList<>();
        for (Product product : orderServiceProductDb.getProductList()) {
            if (product.getProductName().contains(search)) {
                searchList.add(product);
            }
        }
        return searchList;
    }

    public Optional<Product> getProductById(String productId) {
        for (Product product : orderServiceProductDb.getProductList()) {
            if ((product.getProductId()).equals(productId)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

}
