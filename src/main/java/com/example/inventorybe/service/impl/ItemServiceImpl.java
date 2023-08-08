package com.example.inventorybe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventorybe.model.ItemEntity;
import com.example.inventorybe.repository.ItemRepository;
import com.example.inventorybe.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public List<ItemEntity> findAllItems() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	public Optional<ItemEntity> findItemById(Long id) {
		// TODO Auto-generated method stub
		return itemRepository.findById(id);
	}

	@Override
	public ItemEntity updateItem(ItemEntity item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

	@Override
	public ItemEntity saveItem(ItemEntity item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

	@Override
	public void deleteItem(Long id) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(id);
	}

}
