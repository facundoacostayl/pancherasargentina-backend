package com.pancherasargentina.server.pancherasargentinaserver.orderItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemService(OrderItemRepository orderItemRepository) { this.orderItemRepository = orderItemRepository; }


    public List<OrderItem>getOrderItemsByOrderId(Long id) {
        return orderItemRepository.findByOrderId(id);
    }

    public OrderItem addOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }
}