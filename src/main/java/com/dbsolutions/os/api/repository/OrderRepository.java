package com.dbsolutions.os.api.repository;

import com.dbsolutions.os.api.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
