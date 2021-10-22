package com.honda.ccsportal.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehicleDeviceTest {
	
	@Test
	public void test()
	{
		VehicleDevice vehicleDevice=new VehicleDevice();
		vehicleDevice.setVehicle_id(3456);
		vehicleDevice.setDevice_type("boat");
		
		assertEquals(3456,vehicleDevice.getVehicle_id());
		assertEquals("boat",vehicleDevice.getDevice_type());
	}

}
