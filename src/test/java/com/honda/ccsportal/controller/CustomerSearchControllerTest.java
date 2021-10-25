package com.honda.ccsportal.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.honda.ccsportal.model.CustomerSearch;
import com.honda.ccsportal.service.CustomerSearchService;


@RunWith(SpringRunner.class)
@WebMvcTest(value = CustomerSearchController.class)


public class CustomerSearchControllerTest {
	
	/*@Autowired
	private MockMvc mockMvc;

	String URL = "/hlmc/customer/v1";

	@MockBean
	CustomerSearchService customerSearchService;

	@Autowired
	CustomerSearchController customerSearchController;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
    
	@Test
	public void getCustomerDetails() throws Exception{
		
		CustomerSearch customerSearch=new CustomerSearch();
	     customerSearch.setTcu_id("1111");
	     customerSearch.setSerialNumber("asfd123");
	     customerSearch.setTcu_status("Active");
	     customerSearch.setHullnumber("US12314");
	     customerSearch.setBoatName("SeaShore");
	     customerSearch.setCustomer_id(1111);
	     
	     List<CustomerSearch> custList=new ArrayList<>();
	     custList.add(customerSearch);
	     
	     when(customerSearchService.getTcuSerialNumber("asfd123")).thenReturn(custList);
			MvcResult resultInfo = mockMvc.perform(get(URL + "/getcustomerDetails/test honda_id")
					.param("hondaHeaderType.userId", "user123")
					.param("hondaHeaderType.messageId", "550e8400-e29b-41d4-a716-446655440000")
					.param("hondaHeaderType.collectedTimestamp", "2012-08-05T14:02:41.548-05:00")
					.param("hondaHeaderType.country_code", "US").param("hondaHeaderType.language_code", "EN")
					.param("hondaHeaderType.businessId", "HONDALINK MARINE")
					.param("hondaHeaderType.systemId", "com.honda.hondalink.ig_ios")
					.param("hondaHeaderType.siteId", "00e0e97f0fb543208a918fc946dea334")
					.header("hondaHeaderType.messageId", "550e8400-e29b-41d4-a716-446655440000")
					.header("hondaHeaderType.country_code", "US").header("hondaHeaderType.language_code", "EN")
					.header("hondaHeaderType.userId", "user123").header("hondaHeaderType.businessId", "HONDALINK MARINE")
					.header("hondaHeaderType.systemId", "com.honda.hondalink.ig_ios")
					.header("hondaHeaderType.siteId", "00e0e97f0fb543208a918fc946dea334")
					.header("hondaHeaderType.collectedTimestamp", "2012-08-05T14:02:41.548-05:00").accept(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
					.content(asJsonString(custList)).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
					.andReturn();
			verify(customerSearchService, times(1)).getTcuSerialNumber("asfd123");
			verifyNoMoreInteractions(customerSearchService);
		
		
		
	}
	
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	public void getcustomerDetailsException() {
		Mockito.when(customerSearchService.getTcuSerialNumber(URL)).thenThrow(new RuntimeException());
		assertThat(customerSearchController.customerDetails("", "", "", "", "", "", "", "", ""));
	}*/
	
	
	

}
