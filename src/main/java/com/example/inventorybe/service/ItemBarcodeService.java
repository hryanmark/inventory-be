package com.example.inventorybe.service;

import java.util.List;
import java.util.Optional;

import com.example.inventorybe.model.ItemBarcodeEntity;

public interface ItemBarcodeService {
	
	public List<ItemBarcodeEntity> findAllBarcode();
	public Optional<ItemBarcodeEntity> findBarcodeById(Long id);
	public ItemBarcodeEntity updateBarcode(ItemBarcodeEntity barcode);
	public ItemBarcodeEntity saveBarcode(ItemBarcodeEntity barcode);
	public void deleteBarcode(Long id);

}
