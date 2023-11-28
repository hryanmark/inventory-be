package com.example.inventorybe.model;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class ItemEntity {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "brand_id")
	private BigInteger brandId;
	
	@Column(name = "category_id")
	private BigInteger categoryId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "base_uom")
	private BigInteger baseUom;
	
	@Column(name = "sales_uom")
	private BigInteger salesUom;
	
	@Column(name = "puchase_uom")
	private BigInteger purchaseUom;
	
	@Column(name = "unit_cost")
	private Double unitCost;
	
	@Column(name = "minimum_stock_level")
	private Integer minimumStockLevel;
	
	@Column(name = "maximum_stock_level")
	private Integer maximumStockLevel;
	
	@Column(name = "status")
	private Integer status;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	public ItemEntity() {
		super();
	}

	public ItemEntity(Long id, BigInteger brandId, BigInteger categoryId, String title, String description, String sku,
			BigInteger baseUom, BigInteger salesUom, BigInteger purchaseUom, Double unitCost, Integer minimumStockLevel,
			Integer maximumStockLevel, Integer status, String createdBy, String updatedBy, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.brandId = brandId;
		this.categoryId = categoryId;
		this.title = title;
		this.description = description;
		this.sku = sku;
		this.baseUom = baseUom;
		this.salesUom = salesUom;
		this.purchaseUom = purchaseUom;
		this.unitCost = unitCost;
		this.minimumStockLevel = minimumStockLevel;
		this.maximumStockLevel = maximumStockLevel;
		this.status = status;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public ItemEntity(BigInteger brandId, BigInteger categoryId, String title, String description, String sku,
			BigInteger baseUom, BigInteger salesUom, BigInteger purchaseUom, Double unitCost, Integer minimumStockLevel,
			Integer maximumStockLevel, Integer status, String createdBy, String updatedBy, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.brandId = brandId;
		this.categoryId = categoryId;
		this.title = title;
		this.description = description;
		this.sku = sku;
		this.baseUom = baseUom;
		this.salesUom = salesUom;
		this.purchaseUom = purchaseUom;
		this.unitCost = unitCost;
		this.minimumStockLevel = minimumStockLevel;
		this.maximumStockLevel = maximumStockLevel;
		this.status = status;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigInteger getBrandId() {
		return brandId;
	}

	public void setBrandId(BigInteger brandId) {
		this.brandId = brandId;
	}

	public BigInteger getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(BigInteger categoryId) {
		this.categoryId = categoryId;
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

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public BigInteger getBaseUom() {
		return baseUom;
	}

	public void setBaseUom(BigInteger baseUom) {
		this.baseUom = baseUom;
	}

	public BigInteger getSalesUom() {
		return salesUom;
	}

	public void setSalesUom(BigInteger salesUom) {
		this.salesUom = salesUom;
	}

	public BigInteger getPurchaseUom() {
		return purchaseUom;
	}

	public void setPurchaseUom(BigInteger purchaseUom) {
		this.purchaseUom = purchaseUom;
	}

	public Double getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Double unitCost) {
		this.unitCost = unitCost;
	}

	public Integer getMinimumStockLevel() {
		return minimumStockLevel;
	}

	public void setMinimumStockLevel(Integer minimumStockLevel) {
		this.minimumStockLevel = minimumStockLevel;
	}

	public Integer getMaximumStockLevel() {
		return maximumStockLevel;
	}

	public void setMaximumStockLevel(Integer maximumStockLevel) {
		this.maximumStockLevel = maximumStockLevel;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "ItemEntity [id=" + id + ", brandId=" + brandId + ", categoryId=" + categoryId + ", title=" + title
				+ ", description=" + description + ", sku=" + sku + ", baseUom=" + baseUom + ", salesUom=" + salesUom
				+ ", purchaseUom=" + purchaseUom + ", unitCost=" + unitCost + ", minimumStockLevel=" + minimumStockLevel
				+ ", maximumStockLevel=" + maximumStockLevel + ", status=" + status + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
}
