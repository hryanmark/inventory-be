package com.example.inventorybe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "location")
public class LocationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String code;
	
	private String description;
	
	private String address;

	public LocationEntity() {
		super();
	}

	public LocationEntity(String code, String description, String address) {
		super();
		this.code = code;
		this.description = description;
		this.address = address;
	}

	public LocationEntity(Long id, String code, String description, String address) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "LocationEntity [id=" + id + ", code=" + code + ", description=" + description + ", address=" + address
				+ "]";
	}
	
}
