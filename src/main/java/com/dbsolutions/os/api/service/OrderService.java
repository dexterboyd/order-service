package com.dbsolutions.os.api.service;

import com.dbsolutions.os.api.entity.Orders;
import com.dbsolutions.os.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }

}
