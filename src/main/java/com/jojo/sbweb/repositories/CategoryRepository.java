package com.jojo.sbweb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jojo.sbweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}