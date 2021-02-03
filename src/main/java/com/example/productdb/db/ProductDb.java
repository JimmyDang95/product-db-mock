package com.example.productdb.db;

import com.example.productdb.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDb {

    //vordefinierte Db
    private List<Product> productList = new ArrayList<>(List.of(
            new Product("1", "Apple"),
            new Product("2", "Peach")

    ));

    public List<Product> getProductList(){

       return productList;

    }

    public Product addProduct(@RequestBody Product newProduct){
        productList.add(newProduct);
        return newProduct;
    }
}
