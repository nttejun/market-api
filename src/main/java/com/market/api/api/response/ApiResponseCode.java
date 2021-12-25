package com.market.api.api.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ApiResponseCode {

  OK("A0000", "요청이 성공했습니다");

  private final String code;
  private final String message;

}
