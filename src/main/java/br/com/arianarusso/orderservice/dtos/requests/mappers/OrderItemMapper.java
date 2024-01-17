package br.com.arianarusso.orderservice.dtos.requests.mappers;

import br.com.arianarusso.orderservice.dtos.requests.OrderItemDTO;
import br.com.arianarusso.orderservice.model.OrderItem;

public class OrderItemMapper {
    public static OrderItem dtoToEntity(OrderItemDTO dto){
        return new OrderItem(null, dto.product(), dto.quantity(), dto.price());
    }

}
