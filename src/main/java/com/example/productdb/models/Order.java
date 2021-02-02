package com.example.productdb.models;

import java.util.ArrayList;
import java.util.Objects;

public class Order {
    private String orderId;
    private ArrayList<Product> productList;

    public Order(String orderId, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.productList = productList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId.equals(order.orderId) && productList.equals(order.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productList);
    }
}
