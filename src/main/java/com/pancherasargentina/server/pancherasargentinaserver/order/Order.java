package com.pancherasargentina.server.pancherasargentinaserver.order;

import com.pancherasargentina.server.pancherasargentinaserver.orderItem.OrderItem;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table (name = "`order`")
public class Order {
    @Id
    @SequenceGenerator(name = "order_sequence", sequenceName = "order_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
    private Long id;
    private Long shippingId;
    private Integer orderTotal;
    private String status;
    private LocalDate date;
    @OneToMany(mappedBy = "`order`")
    private Set<OrderItem> orderItems;

    public Order() {}


    public Order(Long id, Long shippingId, Integer orderTotal, String status, LocalDate date) {
        this.id = id;
        this.shippingId = shippingId;
        this.orderTotal = orderTotal;
        this.status = status;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShippingId() {
        return shippingId;
    }

    public void setShippingId(Long shippingId) {
        this.shippingId = shippingId;
    }

    public Integer getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Integer orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
