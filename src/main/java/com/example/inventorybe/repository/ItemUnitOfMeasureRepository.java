package com.example.inventorybe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.inventorybe.model.ItemUnitOfMeasureEntity;

@Repository
public interface ItemUnitOfMeasureRepository extends JpaRepository<ItemUnitOfMeasureEntity, Long>{

	// Custom method to find Item Unit Of Measure by item_id
//	@Query("SELECT e FROM ItemUnitOfMeasureEntity e WHERE e.item_id = :item_id")
    Optional<ItemUnitOfMeasureEntity> findByItemId(Integer itemId);
}
