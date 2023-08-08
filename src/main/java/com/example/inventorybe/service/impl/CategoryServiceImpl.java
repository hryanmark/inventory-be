package com.example.inventorybe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.inventorybe.model.CategoryEntity;
import com.example.inventorybe.repository.CategoryRepository;
import com.example.inventorybe.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	private final CategoryRepository categoryRepository;
	
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<CategoryEntity> findAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Optional<CategoryEntity> findCategoryById(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id);
	}

	@Override
	public CategoryEntity updateCategory(CategoryEntity category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public CategoryEntity saveCategory(CategoryEntity category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}

}
