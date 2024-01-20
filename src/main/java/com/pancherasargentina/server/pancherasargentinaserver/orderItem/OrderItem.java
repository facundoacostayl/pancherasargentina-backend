package com.pancherasargentina.server.pancherasargentinaserver.orderItem;

import jakarta.persistence.*;

@Entity
@Table (name = "orderItem")
public class OrderItem {
    @Id
    @SequenceGenerator(name = "orderItem_sequence", sequenceName = "orderItem_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderItem_sequence")
    private Long id;

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
