package com.example.inventorybe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit_of_measure")
public class UnitOfMeasureEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String code;
	
	private String description;

	public UnitOfMeasureEntity() {
		super();
	}

	public UnitOfMeasureEntity(Long id, String code, String description) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
	}

	public UnitOfMeasureEntity(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "UnitOfMeasureEntity [id=" + id + ", code=" + code + ", description=" + description + "]";
	}
	
	
}
