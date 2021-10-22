package com.honda.ccsportal.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CustomerSearchTest {

	@Test
	public void test()
	{
		CustomerSearch customerSearch=new CustomerSearch();
		customerSearch.setBoatName("SeaShore");
		customerSearch.setTcu_id("Tc_1357");
		assertEquals("SeaShore",customerSearch.getBoatName());
		assertEquals("Tc_1357",customerSearch.getTcu_id());
	}
	
}
