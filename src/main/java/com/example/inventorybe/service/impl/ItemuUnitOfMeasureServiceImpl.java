package com.example.inventorybe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventorybe.model.ItemUnitOfMeasureEntity;
import com.example.inventorybe.repository.ItemUnitOfMeasureRepository;
import com.example.inventorybe.service.ItemUnitOfMeasureService;

@Service
public class ItemuUnitOfMeasureServiceImpl implements ItemUnitOfMeasureService{
	
	@Autowired
	private ItemUnitOfMeasureRepository itemUnitOfMeasureRepository;

	@Override
	public List<ItemUnitOfMeasureEntity> findAllItemUnitOfMeasure() {
		// TODO Auto-generated method stub
		return itemUnitOfMeasureRepository.findAll();
	}

	@Override
	public Optional<ItemUnitOfMeasureEntity> findItemUnitOfMeasureById(Long id) {
		// TODO Auto-generated method stub
		return itemUnitOfMeasureRepository.findById(id);
	}

	@Override
	public Optional<ItemUnitOfMeasureEntity> findItemUnitOfMeasureByItemId(Integer itemId) {
		// TODO Auto-generated method stub
		return itemUnitOfMeasureRepository.findByItemId(itemId);
	}

	@Override
	public ItemUnitOfMeasureEntity updateItemUnitOfMeasure(ItemUnitOfMeasureEntity itemUnitOfMeasureEntity) {
		// TODO Auto-generated method stub
		return itemUnitOfMeasureRepository.save(itemUnitOfMeasureEntity);
	}

	@Override
	public ItemUnitOfMeasureEntity saveItemUnitOfMeasure(ItemUnitOfMeasureEntity itemUnitOfMeasureEntity) {
		// TODO Auto-generated method stub
		return itemUnitOfMeasureRepository.save(itemUnitOfMeasureEntity);
	}

	@Override
	public void deleteItemUnitOfMeasure(Long id) {
		// TODO Auto-generated method stub
		itemUnitOfMeasureRepository.deleteById(id);
	}

}
