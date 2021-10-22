package com.honda.ccsportal.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CustomerTest {
	
	@Test
	public void test()
	{
		Customer customer=new Customer();
		customer.setStatus("Active");
		customer.setCreated_by("Honda");
		
		assertEquals("Active", customer.getStatus());
		assertEquals("Honda", customer.getCreated_by());
	}

}
