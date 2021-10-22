package com.honda.ccsportal.entity;


import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class BoatTest {
	@Test
	public void test() {
		List<Engine> engine = new ArrayList<>();
		Engine details = new Engine();
		details.setHorse_power("100");
		details.setVin("vinNumber");
		engine.add(details);
		UUID uuid = UUID.randomUUID();
		Boat data = new Boat();
		data.setBoatLength(100);
		data.setBoatName("boatname");
		data.setBrand("brand");
		data.setEngine(engine);
		data.setHin("hullnumber");
		data.setEngineMake("make");
		data.setModel("model");
		data.setTelematicsProgramId(1);
		data.setTcuNumber("tcunumber");

		assertEquals(100, data.getBoatLength());
		assertEquals("boatname", data.getBoatName());
		assertEquals("brand", data.getBrand());
		assertEquals(engine, data.getEngine());
		assertEquals("hullnumber", data.getHin());
		assertEquals("make", data.getEngineMake());
		assertEquals("model", data.getModel());
		assertEquals(1, data.getTelematicsProgramId());
		assertEquals("tcunumber", data.getTcuNumber());
	}
}
