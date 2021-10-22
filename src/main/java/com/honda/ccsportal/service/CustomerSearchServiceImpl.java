package com.honda.ccsportal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.honda.ccsportal.entity.CustomerSearch;
import com.honda.ccsportal.entity.Tcu;
import com.honda.ccsportal.repository.TcuRepository;

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
	/*	List<CustomerSearch> cs=new ArrayList<>();
		 Tcu tcu=tcuObj.findBySerialNumber(serialNumber).get(0);
		 
		 
		 CustomerSearch customersearch=new CustomerSearch();
		 
		 customersearch.setTcu_id(tcu.getTcu_id());
		 customersearch.setSerialNumber(tcu.getSerialNumber());
		 customersearch.setTcu_status(tcu.getTcuStatus());
		 customersearch.setHullnumber(tcu.getVdObj().getvObj().getVehicle_hin());
		 customersearch.setBoatName(null);
		 customersearch.setCustomer_id(tcu.getVdObj().getvObj().getCdObj().getCustomer_id());
		 cs.add(cs);
		 */
		
		
		Tcu tcu=tcuObj.findBySerialNumber(serialNumber).get(0);
	     
	     CustomerSearch customerSearch=new CustomerSearch();
	     customerSearch.setTcu_id(tcu.getTcu_id());
	     customerSearch.setSerialNumber(tcu.getSerialNumber());
	     customerSearch.setTcu_status(tcu.getTcuStatus());
	     customerSearch.setHullnumber(tcu.getVdObj().getvObj().getVehicle_hin());
	     customerSearch.setBoatName("SeaShore");
	     customerSearch.setCustomer_id(tcu.getVdObj().getvObj().getCdObj().getCustomer_id());
	     
	     List<CustomerSearch> CustomerList=new ArrayList<>();
	     
	     CustomerList.add(customerSearch);
	     
	     return CustomerList;
	}
}
