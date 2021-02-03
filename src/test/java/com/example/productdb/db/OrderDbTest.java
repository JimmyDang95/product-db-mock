package com.example.productdb.db;

import com.example.productdb.models.Order;
import com.example.productdb.models.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderDbTest {

    @Test
    @DisplayName("getOrderList")

    public void getOrderList(){

        //Given
        List<Order> expectedOrderList = new ArrayList<Order>(List.of(
                new Order("1", new ArrayList<Product>(List.of(
                        new Product("1", "Apple")
                )))
        ));

       /* ArrayList<Order> actualOrderList = new ArrayList<Order>(List.of(
                new Order("1", new ArrayList<Product>(List.of(
                        new Product("1", "Apple")
                )))
        ));


        OrderDb orderDb = new OrderDb(actualOrderList);
        */

        OrderDb orderDb = new OrderDb(new ArrayList<Order>(List.of(
                new Order("1", new ArrayList<Product>(List.of(
                        new Product("1", "Apple")
                ))))));

        //When
        List<Order> actualOrderList = orderDb.getOrderList();

        //Then
        assertThat(expectedOrderList, is(actualOrderList));
    }

    /*
    @Test
    @DisplayName("addOrderToList")

    public void addOrderToList(){
        //Given

        //When

        //Then
    }

*/

}