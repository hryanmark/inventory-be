package com.example.inventorybe.service;

import java.util.List;
import java.util.Optional;

import com.example.inventorybe.model.BrandEntity;

public interface BrandService {
	
	public List<BrandEntity> findAllBrands();
	public Optional<BrandEntity> findBrandById(Long id);
	public BrandEntity updateBrandEntity(BrandEntity brand);
	public BrandEntity saveBrand(BrandEntity brand);
	public void deleteBrand(Long id);
}
