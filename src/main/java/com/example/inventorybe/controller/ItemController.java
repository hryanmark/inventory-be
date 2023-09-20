package com.example.inventorybe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventorybe.model.ItemEntity;
import com.example.inventorybe.service.ItemService;

@RestController
@RequestMapping("/api/v1/item")
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public List<ItemEntity> findAllItems(){
		return itemService.findAllItems();
	}
	
	@GetMapping("/{id}")
	public Optional<ItemEntity> findItemById(@PathVariable("id") Long id){
		return itemService.findItemById(id);
	}
	
	@PutMapping
	public ItemEntity updateItemById(@RequestBody ItemEntity item) {
		return itemService.saveItem(item);
	}
	
	@PostMapping
	public ItemEntity saveItem(@RequestBody ItemEntity item) {
		return itemService.saveItem(item);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItemById(@PathVariable("id") Long id) {
		itemService.deleteItem(id);
	}
}
