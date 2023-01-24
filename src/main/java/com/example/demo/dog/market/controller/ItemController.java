package com.example.demo.dog.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dog.market.entity.Item;
import com.example.demo.dog.market.service.ItemService;



@RestController
@RequestMapping(value = "/item")
public class ItemController {
	
	@Autowired ItemService itemService;
	
	@PostMapping(value = "/register" , produces = {"application/json"})
	public void itemRegister(@RequestBody Item item){
		
		itemService.itemRegister(item);
		
		
	}

}
