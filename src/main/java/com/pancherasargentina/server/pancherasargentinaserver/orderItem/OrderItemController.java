package com.pancherasargentina.server.pancherasargentinaserver.orderItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orderItem")
public class OrderItemController {

    private final OrderItemService orderItemService;

    @Autowired
    public OrderItemController(OrderItemService orderItemService ) { this.orderItemService = orderItemService; }

    /*@GetMapping("{id}")
    public List<OrderItem> getOrderItemsByOrderId(@PathVariable Long id) {
        return orderItemService.getOrderItemsByOrderId(id);
    }*/

    public OrderItem addOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.addOrderItem(orderItem);
    }

}
