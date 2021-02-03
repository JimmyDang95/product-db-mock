package com.example.productdb.service;

import com.example.productdb.db.ProductDb;
import com.example.productdb.models.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    @Test
    @DisplayName("getProductList")

    public void getProductList(){

        //Given
        ProductDb productDbMock = mock(ProductDb.class);
        ProductService productService = new ProductService(productDbMock);

        when(productDbMock.getProductList()).thenReturn(new ArrayList<Product>(List.of(
                new Product("1", "Apple"),
                new Product("2", "Peach")
        )));
        //When
        List<Product> result = productService.getProductList();

        //Then
        assertThat(result, containsInAnyOrder(new Product("1", "Apple"),
                new Product("2", "Peach")));

        verify(productDbMock).getProductList();
    }

}