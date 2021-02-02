package com.example.productdb.db;

import com.example.productdb.models.Order;
import com.example.productdb.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDb {
    private ArrayList<Order> orderList = new ArrayList<>();

    public List<Order> getOrderList(){

        return orderList;
    }

    public Order addOrder(Order newOrder){
        orderList.add(newOrder);
        return newOrder;
    }
}
