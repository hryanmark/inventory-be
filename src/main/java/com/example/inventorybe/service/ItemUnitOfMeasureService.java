package com.example.inventorybe.service;

import java.util.List;
import java.util.Optional;

import com.example.inventorybe.model.ItemUnitOfMeasureEntity;

public interface ItemUnitOfMeasureService {
	
	public List<ItemUnitOfMeasureEntity> findAllItemUnitOfMeasure();
	public Optional<ItemUnitOfMeasureEntity> findItemUnitOfMeasureById(Long id);
	public Optional<ItemUnitOfMeasureEntity> findItemUnitOfMeasureByItemId(Integer itemId);
	public ItemUnitOfMeasureEntity updateItemUnitOfMeasure(ItemUnitOfMeasureEntity itemUnitOfMeasureEntity);
	public ItemUnitOfMeasureEntity saveItemUnitOfMeasure(ItemUnitOfMeasureEntity itemUnitOfMeasureEntity);
	public void deleteItemUnitOfMeasure(Long id);

}
