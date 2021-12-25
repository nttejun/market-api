package com.market.api.domain;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table
public class Orders {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String orderId;

  @Column
  private String productName;

  @Column
  private LocalDateTime paymentDate;

  @Builder
  public Orders(Long id, String orderId, String productName, LocalDateTime paymentDate) {
    this.id = id;
    this.orderId = orderId;
    this.productName = productName;
    this.paymentDate = paymentDate;
  }
}
