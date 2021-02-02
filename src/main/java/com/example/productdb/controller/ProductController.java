package com.example.productdb.controller;

import com.example.productdb.db.ProductDb;
import com.example.productdb.models.Product;
import com.example.productdb.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService productService  = new ProductService(new ProductDb());

    @GetMapping("productlist")
    public List<Product> getProductList(){
        return productService.getProductList();
    }

    @PutMapping
    public Product addProduct(@RequestBody Product newProduct){

        return productService.addProduct(newProduct);
    }

}
