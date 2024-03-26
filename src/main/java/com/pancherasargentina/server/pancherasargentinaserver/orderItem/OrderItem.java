package com.pancherasargentina.server.pancherasargentinaserver.orderItem;

import com.pancherasargentina.server.pancherasargentinaserver.order.Order;
import jakarta.persistence.*;

@Entity
@Table (name = "orderItem")
public class OrderItem {
    @Id
    @SequenceGenerator(name = "orderItem_sequence", sequenceName = "orderItem_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderItem_sequence")
    private Long id;

    @ManyToOne
    @JoinColumn(name="orderId", nullable=false)
    private Order order;
    private Long productId;
    private Integer quantity;

    public OrderItem() {}

    public OrderItem(Order order, Long productId, Integer quantity) {
        this.order = order;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
