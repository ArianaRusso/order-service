package br.com.arianarusso.orderservice.services;

import br.com.arianarusso.orderservice.dtos.mappers.OrderItemMapper;
import br.com.arianarusso.orderservice.dtos.mappers.OrderRequestMapper;
import br.com.arianarusso.orderservice.dtos.requests.OrderDto;
import br.com.arianarusso.orderservice.model.Order;
import br.com.arianarusso.orderservice.model.OrderItem;
import br.com.arianarusso.orderservice.model.OrderStatus;
import br.com.arianarusso.orderservice.repositories.OrderItemRepository;
import br.com.arianarusso.orderservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    public void saveOrderAndItems (OrderDto dto){
        Order order = OrderRequestMapper.dtoToEntity(dto);

        for(int i = 0; i < dto.items().size(); i++){
            OrderItem orderItems= OrderItemMapper.dtoToEntity(dto.items().get(i));
            order.getItems().add(orderItems);
        }

//        for (int i = 0; i < dto.items().size(); i++) {
//            OrderItem orderItem = OrderItemMapper.dtoToEntity(dto.items().get(i));
//            order.getItems().add(orderItem);
//        }

        order.setStatus(OrderStatus.PENDING);
        orderRepository.save(order);
    }
}
