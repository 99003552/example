package com.honda.ccsportal.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TcuTest {
	
	@Test
	public void test()
	{
		Tcu tcu=new Tcu();
		tcu.setTcu_id("TC_1234");
		tcu.setCreateNm("honda");
		
		assertEquals("TC_1234",tcu.getTcu_id());
		assertEquals("honda",tcu.getCreateNm());
	}

}
