package com.thbs.bt.unittestingforrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.bt.unittestingforrestapi.model.Item;

@RestController
public class ItemController {
	@GetMapping("/items")
	public Item listOfItems()
	{
		return new Item(1,"ball",2,50);
	}

}
