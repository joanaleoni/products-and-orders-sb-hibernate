package com.jojo.sbweb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jojo.sbweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}