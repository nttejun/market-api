package com.market.api.api.controller;

import com.market.api.service.OrderService;
import com.market.api.service.dto.OrderDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"1. Order"})
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class OrderController {

  private final OrderService orderService;

  @ApiOperation(value = "Order Register", notes = "주문 등록")
  @PostMapping("/order")
  public void register(OrderDto orderDto){
    orderService.register(orderDto.toEntity());
  }

}
