package com.example.inventorybe.service;

import java.util.List;
import java.util.Optional;

import com.example.inventorybe.model.CategoryEntity;

public interface CategoryService {
	
	public List<CategoryEntity> findAllCategories();
	public Optional<CategoryEntity> findCategoryById(Long id);
	public CategoryEntity updateCategory(CategoryEntity category);
	public CategoryEntity saveCategory(CategoryEntity category);
	public void deleteCategory(Long id);
}
