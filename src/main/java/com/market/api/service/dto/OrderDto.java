package com.market.api.service.dto;

import com.market.api.domain.Orders;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {

  private Long id;
  private String orderId;
  private String productName;
  private LocalDateTime paymentDate;

  public Orders toEntity() {
    return Orders.builder()
        .id(id)
        .orderId(orderId)
        .productName(productName)
        .paymentDate(paymentDate)
        .build();
  }
}
