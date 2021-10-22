package com.honda.ccsportal.service;

import java.util.List;

import com.honda.ccsportal.entity.Customer;
import com.honda.ccsportal.entity.CustomerSearch;
import com.honda.ccsportal.entity.Tcu;

public interface CustomerSearchService {

	
	public List<Tcu> getTcuById(String tcu_id);
	
	public List<CustomerSearch> getTcuSerialNumber(String serialNumber);

	
}
