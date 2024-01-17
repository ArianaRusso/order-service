package br.com.arianarusso.orderservice.dtos.requests;

import br.com.arianarusso.orderservice.model.OrderItem;
import br.com.arianarusso.orderservice.model.OrderStatus;
import java.util.List;

public record OrderRequestDto(
        String customer,
        List<OrderItemDTO> items,
        OrderStatus status
) {
}
