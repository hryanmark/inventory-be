package com.example.inventorybe.model;

import jakarta.persistence.Column;
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
	
	@Column(name = "item_id")
	private Integer itemId;
	
	@Column(name = "item_uom")
	private String itemUom; 
	
	@Column(name = "type")
	private Integer type;
	
	@Column(name = "code")
	private String code;

	public ItemBarcodeEntity() {
		super();
	}

	public ItemBarcodeEntity(Integer itemId, String itemUom, Integer type, String code) {
		super();
		this.itemId = itemId;
		this.itemUom = itemUom;
		this.type = type;
		this.code = code;
	}

	public ItemBarcodeEntity(Long id, Integer itemId, String itemUom, Integer type, String code) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.itemUom = itemUom;
		this.type = type;
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemUom() {
		return itemUom;
	}

	public void setItemUom(String itemUom) {
		this.itemUom = itemUom;
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
		return "ItemBarcodeEntity [id=" + id + ", itemId=" + itemId + ", itemUom=" + itemUom + ", type=" + type
				+ ", code=" + code + "]";
	}
	
}
