package com.market.api.repository;

import com.market.api.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
  Orders findByOrderId(String orderId);
}
