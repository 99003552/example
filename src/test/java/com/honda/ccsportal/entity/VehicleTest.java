package com.honda.ccsportal.entity;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehicleTest {

	@Test
	public void test()
	{
		Vehicle vehicle=new Vehicle();
		vehicle.setCustomer_id(1324);
		vehicle.setDoor_alarm_enable(true);
		
		assertEquals(1324, vehicle.getCustomer_id());
		assertEquals(true,vehicle.isDoor_alarm_enable());
	}
	
}
