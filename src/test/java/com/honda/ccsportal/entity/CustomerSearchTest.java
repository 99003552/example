package com.honda.ccsportal.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.honda.ccsportal.model.CustomerSearch;


public class CustomerSearchTest {

	@Test
	public void test()
	{
		CustomerSearch customerSearch=new CustomerSearch();
		customerSearch.setBoatName("SeaShore");
		assertEquals("SeaShore",customerSearch.getBoatName());
	}
	
}
