package com.example.inventorybe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorybe.model.TmpItemEntity;

@Repository
public interface TmpItemRepository extends JpaRepository<TmpItemEntity, Long> {

}
