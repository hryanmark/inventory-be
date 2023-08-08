package com.example.inventorybe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.inventorybe.model.BrandEntity;
import com.example.inventorybe.repository.BrandRepository;
import com.example.inventorybe.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{

	private final BrandRepository brandRepository;
	
	public BrandServiceImpl(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public List<BrandEntity> findAllBrands() {
		// TODO Auto-generated method stub
		return brandRepository.findAll();
	}

	@Override
	public Optional<BrandEntity> findBrandById(Long id) {
		// TODO Auto-generated method stub
		return brandRepository.findById(id);
	}

	@Override
	public BrandEntity updateBrandEntity(BrandEntity brand) {
		// TODO Auto-generated method stub
		return brandRepository.save(brand);
	}

	@Override
	public BrandEntity saveBrand(BrandEntity brand) {
		// TODO Auto-generated method stub
		return brandRepository.save(brand);
	}

	@Override
	public void deleteBrand(Long id) {
		// TODO Auto-generated method stub
		brandRepository.deleteById(id);
	}

}
