package com.market.api.service;

import static java.time.LocalDateTime.now;

import com.market.api.domain.Orders;
import javafx.application.Application;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class OrderServiceTest {

  @Mock
  OrderService orderService;

  @Test
  public void 주문_조회_성공_테스트() {
    Orders order = Orders.builder()
        .orderId("MSGID2011112601")
        .productName("모니터")
        .paymentDate(now())
        .build();
    orderService.register(order);
    Orders registeredOrder = orderService.findByOrderId("MSGID2011112601");
    Assertions.assertThat(order.getOrderId()).isEqualTo(registeredOrder.getOrderId());
  }

  @Test
  public void 주문_등록_성공_테스트() {
    Orders order = Orders.builder()
        .orderId("MSGID2011112601")
        .productName("모니터")
        .paymentDate(now())
        .build();
    orderService.register(order);
  }
}
