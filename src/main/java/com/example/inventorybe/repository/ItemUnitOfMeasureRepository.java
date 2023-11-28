package com.example.inventorybe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorybe.model.ItemUnitOfMeasureEntity;

@Repository
public interface ItemUnitOfMeasureRepository extends JpaRepository<ItemUnitOfMeasureEntity, Long>{

    Optional<ItemUnitOfMeasureEntity> findByItemId(Integer itemId);
}
