package com.example.inventorybe.model;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class ItemEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigInteger brand_id;
	
	private BigInteger category_id;
	
	private String title;
	
	private String description;
	
	private String SKU;
	
	private BigInteger base_uom;
	
	private BigInteger sales_uom;
	
	private BigInteger puchase_uom;
	
	private Double unit_cost;
	
	private Integer minimum_stock_level;
	
	private Integer maximum_stock_level;
	
	private Integer status;
	
	private String created_by;
	
	private String updated_by;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime created_at;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime updated_at;

	public ItemEntity() {
		super();
	}

	public ItemEntity(Long id, BigInteger brand_id, BigInteger category_id, String title, String description,
			String sKU, BigInteger base_uom, BigInteger sales_uom, BigInteger puchase_uom, Double unit_cost,
			Integer minimum_stock_level, Integer maximum_stock_level, Integer status, String created_by,
			String updated_by, LocalDateTime created_at, LocalDateTime updated_at) {
		super();
		this.id = id;
		this.brand_id = brand_id;
		this.category_id = category_id;
		this.title = title;
		this.description = description;
		SKU = sKU;
		this.base_uom = base_uom;
		this.sales_uom = sales_uom;
		this.puchase_uom = puchase_uom;
		this.unit_cost = unit_cost;
		this.minimum_stock_level = minimum_stock_level;
		this.maximum_stock_level = maximum_stock_level;
		this.status = status;
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigInteger getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(BigInteger brand_id) {
		this.brand_id = brand_id;
	}

	public BigInteger getCategory_id() {
		return category_id;
	}

	public void setCategory_id(BigInteger category_id) {
		this.category_id = category_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public BigInteger getBase_uom() {
		return base_uom;
	}

	public void setBase_uom(BigInteger base_uom) {
		this.base_uom = base_uom;
	}

	public BigInteger getSales_uom() {
		return sales_uom;
	}

	public void setSales_uom(BigInteger sales_uom) {
		this.sales_uom = sales_uom;
	}

	public BigInteger getPuchase_uom() {
		return puchase_uom;
	}

	public void setPuchase_uom(BigInteger puchase_uom) {
		this.puchase_uom = puchase_uom;
	}

	public Double getUnit_cost() {
		return unit_cost;
	}

	public void setUnit_cost(Double unit_cost) {
		this.unit_cost = unit_cost;
	}

	public Integer getMinimum_stock_level() {
		return minimum_stock_level;
	}

	public void setMinimum_stock_level(Integer minimum_stock_level) {
		this.minimum_stock_level = minimum_stock_level;
	}

	public Integer getMaximum_stock_level() {
		return maximum_stock_level;
	}

	public void setMaximum_stock_level(Integer maximum_stock_level) {
		this.maximum_stock_level = maximum_stock_level;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "ItemEntity [id=" + id + ", brand_id=" + brand_id + ", category_id=" + category_id + ", title=" + title
				+ ", description=" + description + ", SKU=" + SKU + ", base_uom=" + base_uom + ", sales_uom="
				+ sales_uom + ", puchase_uom=" + puchase_uom + ", unit_cost=" + unit_cost + ", minimum_stock_level="
				+ minimum_stock_level + ", maximum_stock_level=" + maximum_stock_level + ", status=" + status
				+ ", created_by=" + created_by + ", updated_by=" + updated_by + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}
	
}
