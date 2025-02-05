package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class CartItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
	int id;
	
	@Column
	int product_id;
	
	@Column
	int quantity;
	
	@ManyToOne
	User user;
}