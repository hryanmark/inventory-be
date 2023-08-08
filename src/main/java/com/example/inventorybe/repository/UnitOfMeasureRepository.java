package com.example.inventorybe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorybe.model.UnitOfMeasureEntity;

@Repository
public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasureEntity, Long>{

}
