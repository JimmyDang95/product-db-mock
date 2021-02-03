package com.example.productdb.db;

import com.example.productdb.models.Product;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductDbTest {

    @Test
    @DisplayName("getProductList")
    public void getProductListReturnProductList(){

        //Given
        ProductDb productDb = new ProductDb();
        ArrayList<Product> expectedProductList = new ArrayList<>(List.of(
                new Product("1", "Apple"),
                new Product("2", "Peach")
        ));
        //When
        List<Product> actualProductList = productDb.getProductList();

        //Then
        assertThat(actualProductList, is(expectedProductList));
    }

    @Test
    @DisplayName("addProduct")
    public void addProductToDb(){

        //Given
        ProductDb productDb = new ProductDb();

        Product newProduct = new Product("3", "Watermelon");
        //When
        productDb.addProduct(newProduct);

        //Then
        assertThat(productDb.getProductList(), hasItem(new Product("3", "Watermelon")));
    }

}