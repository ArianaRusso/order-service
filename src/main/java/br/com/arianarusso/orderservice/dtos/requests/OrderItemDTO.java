package br.com.arianarusso.orderservice.dtos.requests;

import br.com.arianarusso.orderservice.model.Order;


public record OrderItemDTO (
      String description,
      Integer quantity,
      Order order
){
}
