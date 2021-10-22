package com.honda.ccsportal.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EngineTest {
	@Test
	void test() {
		Engine engine = new Engine();
		engine.setHorse_power("200");
		engine.setVin("TR1234");
		
		assertEquals("200", engine.getHorse_power());
		assertEquals("TR1234", engine.getVin());
	}
}