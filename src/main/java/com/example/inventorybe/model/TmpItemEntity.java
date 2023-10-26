package com.example.inventorybe.model;

import java.math.BigInteger;

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

	private BigInteger user_id;

	public TmpItemEntity() {
		super();
	}

	public TmpItemEntity(BigInteger user_id) {
		super();
		this.user_id = user_id;
	}

	public TmpItemEntity(Long id, BigInteger user_id) {
		super();
		this.id = id;
		this.user_id = user_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigInteger getUser_id() {
		return user_id;
	}

	public void setUser_id(BigInteger user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "TmpItemEntity [id=" + id + ", user_id=" + user_id + "]";
	}

}
