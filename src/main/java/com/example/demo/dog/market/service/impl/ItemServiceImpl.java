package com.example.demo.dog.market.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dog.market.entity.Item;
import com.example.demo.dog.market.repository.ItemRepository;
import com.example.demo.dog.market.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired ItemRepository itemRepo;
	
	@Override
	public void itemRegister(Item item) {
		
		itemRepo.save(item);
	}

	@Override
	public List<Item> getItemList() {
		return itemRepo.findAll();
	}
	
	@Override
	public Item selectOneItem(String itemId) {
		return itemRepo.findById(itemId).orElseThrow(null);
	}

	@Override
	public void itemDelete(String itemId) {
		itemRepo.deleteById(itemId);
	}

	

}
