package com.example.inventorybe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorybe.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
