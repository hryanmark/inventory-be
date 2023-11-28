package com.example.inventorybe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_uom")
public class ItemUnitOfMeasureEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "item_id")
	private Integer itemId;
	
	@Column(name = "unit_of_measure_id")
	private Integer unitOfMeasureId;
	
	@Column(name = "quantity")
	private Integer quantity;

	public ItemUnitOfMeasureEntity() {
		super();
	}

	public ItemUnitOfMeasureEntity(Long id, Integer itemId, Integer unitOfMeasureId, Integer quantity) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.unitOfMeasureId = unitOfMeasureId;
		this.quantity = quantity;
	}

	public ItemUnitOfMeasureEntity(Integer itemId, Integer unitOfMeasureId, Integer quantity) {
		super();
		this.itemId = itemId;
		this.unitOfMeasureId = unitOfMeasureId;
		this.quantity = quantity;
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

	public Integer getUnitOfMeasureId() {
		return unitOfMeasureId;
	}

	public void setUnitOfMeasureId(Integer unitOfMeasureId) {
		this.unitOfMeasureId = unitOfMeasureId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemUnitOfMeasure [id=" + id + ", itemId=" + itemId + ", unitOfMeasureId=" + unitOfMeasureId
				+ ", quantity=" + quantity + "]";
	}
	
	
}
