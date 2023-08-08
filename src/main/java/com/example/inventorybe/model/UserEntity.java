package com.example.inventorybe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String password;
	
	private String name;
	
	private Long contact_info;
	
	private String email;
	
	private Integer status;
	
	private String role;

	public UserEntity() {
		super();
	}

	public UserEntity(String username, String password, String name, Long contact_info, String email, Integer status,
			String role) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.contact_info = contact_info;
		this.email = email;
		this.status = status;
		this.role = role;
	}

	public UserEntity(Long id, String username, String password, String name, Long contact_info, String email,
			Integer status, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.contact_info = contact_info;
		this.email = email;
		this.status = status;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getContact_info() {
		return contact_info;
	}

	public void setContact_info(Long contact_info) {
		this.contact_info = contact_info;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", contact_info=" + contact_info + ", email=" + email + ", status=" + status + ", role=" + role + "]";
	}
	
}
