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

import com.example.inventorybe.model.TmpItemEntity;
import com.example.inventorybe.service.TmpItemService;

@RestController
@RequestMapping("/api/v1/tmp_item")
@CrossOrigin(origins = "http://localhost:3000")
public class TmpItemController {

	@Autowired
	private TmpItemService tmpItemService;
	
	@GetMapping
	public List<TmpItemEntity> findAllTmpItems(){
		return tmpItemService.findAllTmpItems();
	}
	
	@GetMapping("/{id}")
	public Optional<TmpItemEntity> findTmpItemById(@PathVariable("id") Long id){
		return tmpItemService.findTmpItemById(id);
	}
	
	@PutMapping
	public TmpItemEntity updateTmpItemById(@RequestBody TmpItemEntity item) {
		return tmpItemService.saveTmpItem(item);
	}
	
	@PostMapping
	public TmpItemEntity saveTmpItem(@RequestBody TmpItemEntity item) {
		return tmpItemService.saveTmpItem(item);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTmpItemById(@PathVariable("id") Long id) {
		tmpItemService.deleteTmpItem(id);
	}
}
