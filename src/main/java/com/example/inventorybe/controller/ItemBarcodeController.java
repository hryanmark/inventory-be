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

import com.example.inventorybe.model.ItemBarcodeEntity;
import com.example.inventorybe.service.ItemBarcodeService;

@RestController
@RequestMapping("/api/v1/item_barcode")
@CrossOrigin(origins = "http://localhost:3000")
public class ItemBarcodeController {

	@Autowired
	private ItemBarcodeService itemBarcodeService;
	
	@GetMapping
	public List<ItemBarcodeEntity> findAllItemBarcode(){
		return itemBarcodeService.findAllBarcode();
	}
	
	@GetMapping("/{id}")
	public Optional<ItemBarcodeEntity> findItemBarcodeById(@PathVariable("id") Long id){
		return itemBarcodeService.findBarcodeById(id);
	}
	
	@PutMapping
	public ItemBarcodeEntity updateItemBarcode(@RequestBody ItemBarcodeEntity itemBarcode) {
		return itemBarcodeService.saveBarcode(itemBarcode);
	}
	
	@PostMapping
	public ItemBarcodeEntity saveItemBarcode(@RequestBody ItemBarcodeEntity itemBarcode) {
		return itemBarcodeService.saveBarcode(itemBarcode);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItemBarcode(@PathVariable("id") Long id) {
		itemBarcodeService.deleteBarcode(id);
	}
}
