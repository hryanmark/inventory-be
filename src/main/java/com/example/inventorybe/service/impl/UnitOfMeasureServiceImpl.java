package com.example.inventorybe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventorybe.model.UnitOfMeasureEntity;
import com.example.inventorybe.repository.UnitOfMeasureRepository;
import com.example.inventorybe.service.UnitOfMeasureService;

@Service	
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService{

	@Autowired
	private UnitOfMeasureRepository unitOfMeasureRepository;

	@Override
	public List<UnitOfMeasureEntity> findAllUnitOfMeasure() {
		// TODO Auto-generated method stub
		return unitOfMeasureRepository.findAll();
	}

	@Override
	public Optional<UnitOfMeasureEntity> findUnitOfMeasureById(Long id) {
		// TODO Auto-generated method stub
		return unitOfMeasureRepository.findById(id);
	}

	@Override
	public UnitOfMeasureEntity updateUnitOfMeasure(UnitOfMeasureEntity unitOfMeasure) {
		// TODO Auto-generated method stub
		return unitOfMeasureRepository.save(unitOfMeasure);
	}

	@Override
	public UnitOfMeasureEntity saveUnitOfMeasure(UnitOfMeasureEntity unitOfMeasure) {
		// TODO Auto-generated method stub
		return unitOfMeasureRepository.save(unitOfMeasure);
	}

	@Override
	public void deleteUnitOfMeasure(Long id) {
		// TODO Auto-generated method stub
		unitOfMeasureRepository.deleteById(id);
	}

}
