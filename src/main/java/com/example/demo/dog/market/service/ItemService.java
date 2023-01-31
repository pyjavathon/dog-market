package com.example.demo.dog.market.service;

import java.util.List;

import com.example.demo.dog.market.entity.Item;

public interface ItemService {
	
	public void itemRegister(Item item);

	public List<Item> getItemList();
	
	public Item selectOneItem(String itemId);

	public void itemDelete(String itemId);

	

}
