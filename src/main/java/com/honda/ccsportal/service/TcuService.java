package com.honda.ccsportal.service;

import java.util.List;

import com.honda.ccsportal.entity.Customer;
import com.honda.ccsportal.entity.Tcu;

public interface TcuService {

	
	public List<Tcu> getTcuById(String tcu_id);
	
	public Customer getTcuSerialNumber(String serialNumber);

	
}
