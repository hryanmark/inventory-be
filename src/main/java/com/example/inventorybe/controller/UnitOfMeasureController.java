package com.example.inventorybe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventorybe.model.UnitOfMeasureEntity;
import com.example.inventorybe.service.UnitOfMeasureService;

@RestController
@RequestMapping("/api/v1/unit_of_measure")
public class UnitOfMeasureController {
	
	private final UnitOfMeasureService unitOfMeasureService;

	public UnitOfMeasureController(UnitOfMeasureService unitOfMeasureService) {
		super();
		this.unitOfMeasureService = unitOfMeasureService;
	}
	
	@GetMapping
	public List<UnitOfMeasureEntity> findAllUnitOfMeasure(){
		return unitOfMeasureService.findAllUnitOfMeasure();
	}
	
	@GetMapping("/{id}")
	public Optional<UnitOfMeasureEntity> findUnitOfMeasureById(@PathVariable("id") Long id) {
		return unitOfMeasureService.findUnitOfMeasureById(id);
	}
	
	@PutMapping
	public UnitOfMeasureEntity updateUnitOfMeasure(@RequestBody UnitOfMeasureEntity unitOfMeasure) {
		return unitOfMeasureService.saveUnitOfMeasure(unitOfMeasure);
	}
	
	@PostMapping
	public UnitOfMeasureEntity saveUnitOfMeasure(@RequestBody UnitOfMeasureEntity unitOfMeasure) {
		return unitOfMeasureService.saveUnitOfMeasure(unitOfMeasure);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUnitOfMeasure(@PathVariable("id") Long id) {
		unitOfMeasureService.deleteUnitOfMeasure(id);
	}
}
