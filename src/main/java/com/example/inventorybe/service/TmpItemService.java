package com.example.inventorybe.service;

import java.util.List;
import java.util.Optional;

import com.example.inventorybe.model.TmpItemEntity;

	public interface TmpItemService {

	public List<TmpItemEntity> findAllTmpItems();
	public Optional<TmpItemEntity> findTmpItemById(Long id);
	public TmpItemEntity updateTmpItem(TmpItemEntity tmpItemEntity);
	public TmpItemEntity saveTmpItem(TmpItemEntity tmpItemEntity);
	public void deleteTmpItem(Long id);
}
