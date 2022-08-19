package com.dbsolutions.os.api.controller;

import com.dbsolutions.os.api.entity.Orders;
import com.dbsolutions.os.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/bookOrder")
    public Orders bookOrder(@RequestBody Orders order) {

        // TODO: 8/18/2022 make rest call to payment and pass order id
        return orderService.saveOrder(order);
    }
}
