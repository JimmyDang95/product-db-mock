package com.example.productdb.controller;

import com.example.productdb.db.ProductDb;
import com.example.productdb.models.Product;
import com.example.productdb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;
    //= new ProductService(new ProductDb());

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("productlist")
    public List<Product> getProductList(){
        return productService.getProductList();
    }

    @PutMapping
    public Product addProduct(@RequestBody Product newProduct){
        return productService.addProduct(newProduct);
    }

    @GetMapping
    public List<Product> searchProduct(@RequestParam String search){
        return productService.searchProducts(search);
    }

    @GetMapping("{productId}")
    public Product getProductById(@PathVariable String productId){
        Optional<Product> productOptional = productService.getProductById(productId);
        if(productOptional.isPresent()){
            return productOptional.get();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "product with product id " + productId + " does not exist");
    }


}
