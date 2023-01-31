package com.example.demo.dog.market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dog.market.entity.Item;
import com.example.demo.dog.market.service.ItemService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name = "item controller", description = "item controller desc")
@RestController
@RequestMapping(value = "/item")
public class ItemController {
	
	@Autowired ItemService itemService;
	
	@Operation(summary = "item register method", description = "item register method description")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "successful operation"),
			@ApiResponse(responseCode = "404", description = "not found")
	})
	@PostMapping(value = "/itemRegister" , produces = {"application/json"})
	public void itemRegister(@RequestBody Item item){
		
		itemService.itemRegister(item);
		
		
	}
	

	@GetMapping(value = "/searchItems")
	public @ResponseBody List<Item> getItemList() {
		return itemService.getItemList();
	}
	
	@GetMapping(value = "selectOneItem")
	public @ResponseBody Item selectOneItem(@RequestParam String itemId) {
		return itemService.selectOneItem(itemId);
	}
	
	@Operation(summary = "item delete method", description = "item delete method description")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "successful operation"),
			@ApiResponse(responseCode = "404", description = "not found")
	})
	@DeleteMapping(value = "/itemDelete")
	public void itemDelete(@RequestParam String itemId) {
		itemService.itemDelete(itemId);
	}
	

}
