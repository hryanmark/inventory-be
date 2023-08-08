package com.example.inventorybe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_barcode")
public class ItemBarcodeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer item_id;
	
	private String item_uom; 
	
	private Integer type;
	
	private String code;

	public ItemBarcodeEntity() {
		super();
	}

	public ItemBarcodeEntity(Integer item_id, String item_uom, Integer type, String code) {
		super();
		this.item_id = item_id;
		this.item_uom = item_uom;
		this.type = type;
		this.code = code;
	}

	public ItemBarcodeEntity(Long id, Integer item_id, String item_uom, Integer type, String code) {
		super();
		this.id = id;
		this.item_id = item_id;
		this.item_uom = item_uom;
		this.type = type;
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getItem_id() {
		return item_id;
	}

	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	public String getItem_uom() {
		return item_uom;
	}

	public void setItem_uom(String item_uom) {
		this.item_uom = item_uom;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ItemBarcodeEntity [id=" + id + ", item_id=" + item_id + ", item_uom=" + item_uom + ", type=" + type
				+ ", code=" + code + "]";
	}
	
}
