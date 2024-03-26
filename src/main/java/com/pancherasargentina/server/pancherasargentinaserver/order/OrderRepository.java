package com.pancherasargentina.server.pancherasargentinaserver.order;

import com.pancherasargentina.server.pancherasargentinaserver.orderItem.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
