package com.example.inventorybe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorybe.model.ItemEntity;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long>{

}
