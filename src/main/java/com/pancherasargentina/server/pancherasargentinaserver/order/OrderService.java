package com.pancherasargentina.server.pancherasargentinaserver.order;

import com.pancherasargentina.server.pancherasargentinaserver.shipping.Shipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrderStatus(long id, String status) {
        Order orderToUpdate = orderRepository.findById(id).orElseThrow();

        orderToUpdate.setStatus(status);

        return orderRepository.save(orderToUpdate);
    }
}