package com.example.advancedassign3.repository;

import com.example.advancedassign3.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
