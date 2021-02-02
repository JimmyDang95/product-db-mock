package com.example.productdb.service;

import java.util.List;

import com.example.productdb.db.OrderDb;
import com.example.productdb.db.ProductDb;
import com.example.productdb.models.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderService {

    private final ProductDb orderServiceProductDb;
    private final OrderDb orderServiceOrderDb;

    public OrderService(ProductDb orderServiceProductDb,
                        OrderDb orderServiceOrderDb) {
        this.orderServiceProductDb = orderServiceProductDb;
        this.orderServiceOrderDb = orderServiceOrderDb;
    }

    public List<Order> getOrderList(){

        return orderServiceOrderDb.getOrderList();
    }

    public Order addOrder(@RequestBody Order newOrder){

        return orderServiceOrderDb.addOrder(newOrder);
    }


}
