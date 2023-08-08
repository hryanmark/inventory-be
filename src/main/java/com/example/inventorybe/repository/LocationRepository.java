package com.example.inventorybe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorybe.model.LocationEntity;

@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Long>{

}
