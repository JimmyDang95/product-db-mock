package com.example.productdb.controller;

import com.example.productdb.db.ProductDb;
import com.example.productdb.models.Product;
import com.example.productdb.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("product")
public class ProductController {

    private final OrderService orderService  = new OrderService(new ProductDb());

    @GetMapping("productlist")
    public List<Product> getProductList(){
        return orderService.getProductList();
    }

    @PutMapping
    public Product addProduct(@RequestBody Product newProduct){

        return orderService.addProduct(newProduct);
    }

}
