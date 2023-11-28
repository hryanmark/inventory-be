package com.example.inventorybe.model;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tmp_item")
public class TmpItemEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private BigInteger userId;

	public TmpItemEntity() {
		super();
	}

	public TmpItemEntity(BigInteger userId) {
		super();
		this.userId = userId;
	}

	public TmpItemEntity(Long id, BigInteger userId) {
		super();
		this.id = id;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "TmpItemEntity [id=" + id + ", userId=" + userId + "]";
	}

}
