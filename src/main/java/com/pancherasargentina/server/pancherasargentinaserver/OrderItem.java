package com.pancherasargentina.server.pancherasargentinaserver;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "orderItem")
public class OrderItem {
    private Long orderId;
    private Long productId;
    private Integer quantity;

    public OrderItem() {}

    public OrderItem(Long orderId, Long productId, Integer quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
