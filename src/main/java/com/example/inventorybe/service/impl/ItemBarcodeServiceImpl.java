package com.example.inventorybe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventorybe.model.ItemBarcodeEntity;
import com.example.inventorybe.repository.ItemBarcodeRepository;
import com.example.inventorybe.service.ItemBarcodeService;

@Service
public class ItemBarcodeServiceImpl implements ItemBarcodeService{
	
	@Autowired
	private ItemBarcodeRepository itemBarcodeRepository;

	@Override
	public List<ItemBarcodeEntity> findAllBarcode() {
		// TODO Auto-generated method stub
		return itemBarcodeRepository.findAll();
	}

	@Override
	public Optional<ItemBarcodeEntity> findBarcodeById(Long id) {
		// TODO Auto-generated method stub
		return itemBarcodeRepository.findById(id);
	}

	@Override
	public ItemBarcodeEntity updateBarcode(ItemBarcodeEntity barcode) {
		// TODO Auto-generated method stub
		return itemBarcodeRepository.save(barcode);
	}

	@Override
	public ItemBarcodeEntity saveBarcode(ItemBarcodeEntity barcode) {
		// TODO Auto-generated method stub
		return itemBarcodeRepository.save(barcode);
	}

	@Override
	public void deleteBarcode(Long id) {
		// TODO Auto-generated method stub
		itemBarcodeRepository.deleteById(id);
	}

}
