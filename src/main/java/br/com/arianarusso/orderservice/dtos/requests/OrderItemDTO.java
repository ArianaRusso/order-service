package br.com.arianarusso.orderservice.dtos.requests;

import java.math.BigDecimal;

public record OrderItemDTO (
      String product,
      Integer quantity,
      BigDecimal price
){
}
