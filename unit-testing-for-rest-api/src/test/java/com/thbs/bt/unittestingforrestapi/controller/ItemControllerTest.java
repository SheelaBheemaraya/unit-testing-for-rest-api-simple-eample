package com.thbs.bt.unittestingforrestapi.controller;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
class ItemControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void item_basic() throws Exception {
		//call GET "/items"  application/json
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/items")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string("{\"id\":1,\"name\":\"ball\",\"price\":2,\"quantity\":50}"))
				.andReturn();
	}
}


