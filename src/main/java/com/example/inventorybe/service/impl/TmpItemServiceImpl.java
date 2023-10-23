package com.example.inventorybe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventorybe.model.TmpItemEntity;
import com.example.inventorybe.repository.TmpItemRepository;
import com.example.inventorybe.service.TmpItemService;

@Service
public class TmpItemServiceImpl implements TmpItemService{

	@Autowired
	TmpItemRepository tmpItemRepository;

	@Override
	public List<TmpItemEntity> findAllTmpItems() {
		// TODO Auto-generated method stub
		return tmpItemRepository.findAll();
	}

	@Override
	public Optional<TmpItemEntity> findTmpItemById(Long id) {
		// TODO Auto-generated method stub
		return tmpItemRepository.findById(id);
	}

	@Override
	public TmpItemEntity updateTmpItem(TmpItemEntity tmpItemEntity) {
		// TODO Auto-generated method stub
		return tmpItemRepository.save(tmpItemEntity);
	}

	@Override
	public TmpItemEntity saveTmpItem(TmpItemEntity tmpItemEntity) {
		// TODO Auto-generated method stub
		return tmpItemRepository.save(tmpItemEntity);
	}

	@Override
	public void deleteTmpItem(Long id) {
		// TODO Auto-generated method stub
		tmpItemRepository.deleteById(id);
	}
	
}
