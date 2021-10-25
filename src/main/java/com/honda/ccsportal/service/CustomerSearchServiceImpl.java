package com.honda.ccsportal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honda.ccsportal.entity.Engine;
import com.honda.ccsportal.entity.Tcu;
import com.honda.ccsportal.model.CustomerSearch;
import com.honda.ccsportal.model.CustomerSearchEngine;
import com.honda.ccsportal.repository.TcuRepository;


@Service
public class CustomerSearchServiceImpl implements CustomerSearchService{

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
		
		Tcu tcu=tcuObj.findBySerialNumber(serialNumber).get(0);
		
	     
	     CustomerSearch customerSearch=new CustomerSearch();
	     customerSearch.setSerialNumber(tcu.getSerialNumber());
	     customerSearch.setTcu_status(tcu.getTcuStatus());
	     customerSearch.setHullnumber(tcu.getVdObj().getvObj().getVehicle_hin());
	     customerSearch.setBoatName(tcu.getVdObj().getvObj().getVehicle_name());
	     customerSearch.setCustomer_id(tcu.getVdObj().getvObj().getCdObj().getHidas_id());
	     
	     
	     List<CustomerSearch> CustomerList=new ArrayList<>();
	     
	     CustomerList.add(customerSearch);
	     
	     return CustomerList;
	}

	@Override
	public List<CustomerSearchEngine> getEngineDetails(int engine_id) {
		// TODO Auto-generated method stub
		
		Engine engine=tcuObj.findByengine_id(engine_id).get(0);
		
		CustomerSearchEngine customerSearchEngine=new CustomerSearchEngine();
		customerSearchEngine.setBoatName(engine.getVdObj().getvObj().getVehicle_name());
		customerSearchEngine.setCustomer_id(engine.getVdObj().getvObj().getCdObj().getHidas_id());
		customerSearchEngine.setEngine_id(engine.getEngine_id());
		customerSearchEngine.setEngine_status(engine.getEngine_status());
		
		List<CustomerSearchEngine> CustomerList=new ArrayList<>();
	     
	     CustomerList.add(customerSearchEngine);
	     
	     return CustomerList;
		
		
	}
	
	
}
