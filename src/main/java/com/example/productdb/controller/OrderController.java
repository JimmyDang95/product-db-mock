package com.example.productdb.controller;

import com.example.productdb.db.OrderDb;
import com.example.productdb.db.ProductDb;
import com.example.productdb.models.Order;
import com.example.productdb.models.Product;
import com.example.productdb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {


    private final ProductDb productDb;
    //= new ProductDb();
    private final OrderDb orderDb;
    //= new OrderDb();
    private final OrderService orderService;
    //= new OrderService(productDb, orderDb);


    @Autowired
    public OrderController(ProductDb productDb, OrderDb orderDb, OrderService orderService) {
        this.productDb = productDb;
        this.orderDb = orderDb;
        this.orderService = orderService;
    }

    @GetMapping("orderlist")
    public List<Order> getOrderList(){
        return orderService.getOrderList();
    }

    @PutMapping
    public Order addOrder(@RequestBody Order newOrder){

        return orderService.addOrder(newOrder);
    }
}
