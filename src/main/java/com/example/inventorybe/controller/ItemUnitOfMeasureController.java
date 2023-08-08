package com.example.inventorybe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventorybe.model.ItemUnitOfMeasureEntity;
import com.example.inventorybe.service.ItemUnitOfMeasureService;

@RestController
@RequestMapping("/api/v1/item_unit_of_measure")
public class ItemUnitOfMeasureController {

	@Autowired
	private ItemUnitOfMeasureService itemUnitOfMeasureService;
	
	@GetMapping
	public List<ItemUnitOfMeasureEntity> findAllItemUnitOfMeasure(){
		return itemUnitOfMeasureService.findAllItemUnitOfMeasure();
	}
	
	@GetMapping("/{id}")
	public Optional<ItemUnitOfMeasureEntity> findItemUnitOfMeasureById(@PathVariable("id") Long id) {
		return itemUnitOfMeasureService.findItemUnitOfMeasureById(id);
	}
	
	@PutMapping
	public ItemUnitOfMeasureEntity updateItemUnitOfMeasure(@RequestBody ItemUnitOfMeasureEntity itemUnitOfMeasureEntity) {
		return itemUnitOfMeasureService.updateItemUnitOfMeasure(itemUnitOfMeasureEntity);
	}
	
	@PostMapping
	public ItemUnitOfMeasureEntity saveItemUnitOfMeasure(@RequestBody ItemUnitOfMeasureEntity itemUnitOfMeasureEntity) {
		return itemUnitOfMeasureService.saveItemUnitOfMeasure(itemUnitOfMeasureEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItemUnitOfMeasure(@PathVariable("id") Long id) {
		itemUnitOfMeasureService.deleteItemUnitOfMeasure(id);
	}
}
