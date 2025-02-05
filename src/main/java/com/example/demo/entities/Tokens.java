package com.example.demo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jwt_tokens")
public class Tokens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int token_id;
	
	@Column
	private String token;
	
	@ManyToOne
	@JoinColumn
	private User user_id;
	
	@Column
	private LocalDateTime expires_at;
	
	@Column
	private LocalDateTime created_at;
	
	public Tokens() {
		// TODO Auto-generated constructor stub
	}

	public Tokens(int token_id, String token, User user_id, LocalDateTime expires_at, LocalDateTime created_at) {
		super();
		this.token_id = token_id;
		this.token = token;
		this.user_id = user_id;
		this.expires_at = expires_at;
		this.created_at = created_at;
	}

	public Tokens(String token, User user_id, LocalDateTime expires_at, LocalDateTime created_at) {
		super();
		this.token = token;
		this.user_id = user_id;
		this.expires_at = expires_at;
		this.created_at = created_at;
	}
	
	public int getToken_id() {
		return token_id;
	}

	public void setToken_id(int token_id) {
		this.token_id = token_id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public LocalDateTime getExpires_at() {
		return expires_at;
	}

	public void setExpires_at(LocalDateTime expires_at) {
		this.expires_at = expires_at;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	
	
	
}