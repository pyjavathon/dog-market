package com.example.demo.dog.market.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	
	@Id
	@Column(name = "item_id")
	private String itemId;
	
	private String itemName;
	
	private String itemCategory;
	
	private String itemPrice;
	
	private String itemStock;
	
	private String itemImage;
	
	private String itemAddImage1;
	
	private String itemAddImage2;
	
	private String itemDesc;
	
	private String itemQuantity;
	
}
