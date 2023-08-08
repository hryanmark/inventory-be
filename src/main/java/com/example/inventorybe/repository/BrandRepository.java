package com.example.inventorybe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorybe.model.BrandEntity;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Long>{

}
