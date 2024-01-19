package br.com.arianarusso.orderservice.dtos.mappers;
import br.com.arianarusso.orderservice.dtos.requests.OrderDto;
import br.com.arianarusso.orderservice.model.Order;
import br.com.arianarusso.orderservice.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestMapper {

    public static Order dtoToEntity (OrderDto dto){

        List<OrderItem> orderItems= new ArrayList<>();

//        for(int i = 0; i < dto.items().size(); i++){
//            orderItems.add(OrderItemMapper.dtoToEntity(dto.items().get(i)));
//        }
        return new Order(null, orderItems , null);
    }
}
