package com.jojo.sbweb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jojo.sbweb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}