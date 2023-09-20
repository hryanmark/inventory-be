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

import com.example.inventorybe.model.CategoryEntity;
import com.example.inventorybe.service.CategoryService;

@RestController
@RequestMapping("/api/v1/category")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public List<CategoryEntity> findAllCategory(){
		return categoryService.findAllCategories();
	}
	
	@GetMapping("/{id}")
	public Optional<CategoryEntity> findCategoryById(@PathVariable("id") Long id) {
		return categoryService.findCategoryById(id);
	}
	
	@PutMapping
	public CategoryEntity updateCategory(@RequestBody CategoryEntity category) {
		return categoryService.saveCategory(category);
	}
	
	@PostMapping
	public CategoryEntity saveCategory(@RequestBody CategoryEntity category) {
		return categoryService.saveCategory(category);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable("id") Long id) {
		categoryService.deleteCategory(id);
	}
}
