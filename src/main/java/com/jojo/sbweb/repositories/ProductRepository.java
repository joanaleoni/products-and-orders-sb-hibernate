package com.jojo.sbweb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jojo.sbweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}