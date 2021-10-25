package com.honda.ccsportal.service;

import java.util.List;

import com.honda.ccsportal.entity.Customer;
import com.honda.ccsportal.entity.Tcu;
import com.honda.ccsportal.model.CustomerSearch;
import com.honda.ccsportal.model.CustomerSearchEngine;

public interface CustomerSearchService {

	
	public List<Tcu> getTcuById(String tcu_id);
	
	public List<CustomerSearch> getTcuSerialNumber(String serialNumber);
	
	public List<CustomerSearchEngine> getEngineDetails(int engine_id);

	
}
