package com.delivery.apidelivery.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.delivery.apidelivery.entities.Order;

@Service
public class OrderService {

    private Map<Integer, Order> orders = new HashMap<>();
    private int nextId = 1;

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    public Order getOrderById(int id) {
        return orders.get(id);
    }

    public Order createOrder(Order order) {
        order.setId(nextId++);
        orders.put(order.getId(), order);
        return order;
    }

    public Order updateOrder(Order order) {
        orders.put(order.getId(), order);
        return order;
    }

    public void deleteOrder(int id) {
        orders.remove(id);
    }
}
