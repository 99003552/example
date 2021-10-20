package com.honda.ccsportal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.honda.ccsportal.entity.CustomerSearch;
import com.honda.ccsportal.entity.Tcu;
import com.honda.ccsportal.repository.TcuRepository;

public class TcuServiceImpl implements TcuService{

	@Autowired
	private TcuRepository tcuObj;
	
	
	

	public List<Tcu> getTcu() {
	    return tcuObj.findAll();
	}

	@Override
	public List<Tcu> getTcuById(String tcu_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerSearch> getTcuSerialNumber(String serialNumber) {
		// TODO Auto-generated method stub
		List<CustomerSearch> cs=new ArrayList<>();
		 Tcu tcu=tcuObj.findBySerialNumber(serialNumber).get(0);
		 CustomerSearch customersearch=new CustomerSearch();
		 customersearch.setTcu_id(tcu.getTcu_id());
		 customersearch.setSerialNumber(tcu.getSerialNumber());
		 customersearch.setTcu_status(tcu.getTcuStatus());
		 customersearch.setBoatName(null);
		 customersearch.setCustomer_id(tcu.getVdObj().getvObj().getCdObj().getCustomer_id());
		 cs.addAll(cs);
		 
		 return cs;
	}
}
