package com.amit.heartbeat.microservices.infrastructure.authorizationserver.repository;

import com.amit.heartbeat.microservices.infrastructure.authorizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User, Integer> {


    Optional<User> findByUsername(String name);

}
