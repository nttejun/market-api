package com.market.api.service;

import com.market.api.domain.Orders;
import com.market.api.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderService {

  private final OrderRepository orderRepository;

  public Orders findByOrderId(String orderId) {
    return orderRepository.findByOrderId(orderId);
  }

  @Transactional
  public void register(Orders order) {
    orderRepository.save(order);
  }
}
