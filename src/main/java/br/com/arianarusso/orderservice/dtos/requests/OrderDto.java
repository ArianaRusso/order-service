package br.com.arianarusso.orderservice.dtos.requests;

import br.com.arianarusso.orderservice.model.OrderStatus;

import java.util.List;

public record OrderDto(
        List<OrderItemDTO> items,
        OrderStatus status
) {
}
