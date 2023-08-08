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

import com.example.inventorybe.model.BrandEntity;
import com.example.inventorybe.service.BrandService;

@RestController
@RequestMapping("/api/v1/brand")
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@GetMapping
	public List<BrandEntity> findAllBrands(){
		return brandService.findAllBrands();
	}
	
	@GetMapping("/{id}")
	public Optional<BrandEntity> findBrandById(@PathVariable("id") Long id) {
		return brandService.findBrandById(id);
	}
	
	@PutMapping
	public BrandEntity updateBrand(@RequestBody BrandEntity brand) {
		return brandService.updateBrandEntity(brand);
	}
	
	@PostMapping
	public BrandEntity saveBrand(@RequestBody BrandEntity brand) {
		return brandService.saveBrand(brand);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBrand(@PathVariable("id") Long id) {
		brandService.deleteBrand(id);
	}
}
