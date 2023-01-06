package com.jojo.sbweb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jojo.sbweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}