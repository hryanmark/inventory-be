package com.example.inventorybe.model;

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
	
	private Integer item_id;
	
	private Integer unit_of_measure_id;
	
	private Integer quantity;

	public ItemUnitOfMeasureEntity() {
		super();
	}

	public ItemUnitOfMeasureEntity(Long id, Integer item_id, Integer unit_of_measure_id, Integer quantity) {
		super();
		this.id = id;
		this.item_id = item_id;
		this.unit_of_measure_id = unit_of_measure_id;
		this.quantity = quantity;
	}

	public ItemUnitOfMeasureEntity(Integer item_id, Integer unit_of_measure_id, Integer quantity) {
		super();
		this.item_id = item_id;
		this.unit_of_measure_id = unit_of_measure_id;
		this.quantity = quantity;
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

	public Integer getUnit_of_measure_id() {
		return unit_of_measure_id;
	}

	public void setUnit_of_measure_id(Integer unit_of_measure_id) {
		this.unit_of_measure_id = unit_of_measure_id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemUnitOfMeasure [id=" + id + ", item_id=" + item_id + ", unit_of_measure_id=" + unit_of_measure_id
				+ ", quantity=" + quantity + "]";
	}
	
	
}
