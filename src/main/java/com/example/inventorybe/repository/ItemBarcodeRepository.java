package com.example.inventorybe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorybe.model.ItemBarcodeEntity;

@Repository
public interface ItemBarcodeRepository extends JpaRepository<ItemBarcodeEntity, Long>{

}
