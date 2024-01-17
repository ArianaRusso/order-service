package br.com.arianarusso.orderservice.dtos.requests.mappers;
import br.com.arianarusso.orderservice.dtos.requests.OrderRequestDto;
import br.com.arianarusso.orderservice.model.Order;
import br.com.arianarusso.orderservice.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestMapper {
    public static Order dtoToEntity (OrderRequestDto dto){

        List<OrderItem> orderItems= new ArrayList<>();

        for(int i = 0; i < dto.items().size(); i++){
            orderItems.add(OrderItemMapper.dtoToEntity(dto.items().get(i)));
        }
        return new Order(null, dto.customer(), orderItems , dto.status());
    }
}
