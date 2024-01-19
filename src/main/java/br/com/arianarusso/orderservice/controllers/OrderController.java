package br.com.arianarusso.orderservice.controllers;

import br.com.arianarusso.orderservice.dtos.requests.OrderDto;
import br.com.arianarusso.orderservice.services.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Valid OrderDto order){
        service.saveOrderAndItems(order);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
