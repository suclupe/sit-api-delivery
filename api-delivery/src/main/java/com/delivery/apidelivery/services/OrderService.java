package com.delivery.apidelivery.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.delivery.apidelivery.entities.Food;
import com.delivery.apidelivery.entities.Order;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order getOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                return order;
            }
        }
        return null;
    }

    public void updateOrderStatus(int orderId, String newStatus) {
        Order order = getOrderById(orderId);
        if (order != null) {
            order.setStatus(newStatus);
        }
    }

    private int generateOrderId() {
        // implement your own logic to generate unique order ids
        return orders.size() + 1;
    }
}
