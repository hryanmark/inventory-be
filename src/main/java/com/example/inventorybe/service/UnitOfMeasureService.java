package com.example.inventorybe.service;

import java.util.List;
import java.util.Optional;

import com.example.inventorybe.model.UnitOfMeasureEntity;

public interface UnitOfMeasureService {
	
	public List<UnitOfMeasureEntity> findAllUnitOfMeasure();
	public Optional<UnitOfMeasureEntity> findUnitOfMeasureById(Long id);
	public UnitOfMeasureEntity updateUnitOfMeasure(UnitOfMeasureEntity unitOfMeasure);
	public UnitOfMeasureEntity saveUnitOfMeasure(UnitOfMeasureEntity unitOfMeasureEntity);
	public void deleteUnitOfMeasure(Long id);
}
