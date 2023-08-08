package com.example.inventorybe.service;

import java.util.List;
import java.util.Optional;


import com.example.inventorybe.model.ItemEntity;

public interface ItemService {
	
	
	public List<ItemEntity> findAllItems();
	public Optional<ItemEntity> findItemById(Long id);
	public ItemEntity updateItem(ItemEntity itemEntity);
	public ItemEntity saveItem(ItemEntity itemEntity);
	public void deleteItem(Long id);
}
