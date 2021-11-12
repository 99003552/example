package com.honda.ccsportal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.honda.ccsportal.entity.CustomerDetails;
import com.honda.ccsportal.entity.Engine;
import com.honda.ccsportal.entity.Tcu;
import com.honda.ccsportal.model.CustomerSearch;
import com.honda.ccsportal.model.CustomerSearchEngine;
import com.honda.ccsportal.repository.EngineRepository;
import com.honda.ccsportal.repository.TcuRepository;


@Service
public class CustomerSearchServiceImpl implements CustomerSearchService{

	@Autowired
	private TcuRepository tcuObj;
	
	@Autowired
	private EngineRepository engineObj;
	
	@Autowired
	private UserAuthenticationServiceImpl UserAuth;


	@Override
	public List<CustomerSearch> getTcuSerialNumber(String serialNumber) {
		// TODO Auto-generated method stub
		
		Tcu tcu=tcuObj.findBySerialNumber(serialNumber).get(0);
		
	     
	     CustomerSearch customerSearch=new CustomerSearch();
	     //customerSearch.setSerialNumber(tcu.getSerialNumber());
	     customerSearch.setTCUStatus(tcu.getTcuStatus());
	     customerSearch.setTcuNumber(tcu.getSerialNumber());
	    // customerSearch.setTcuNumber(tcu.getVdObj().getvObj().getVehicle_hin());
	     customerSearch.setBoatName(tcu.getVehicledeviceObj().getVehicleObj().getVehicle_name());//.getVdObj().getvObj().getVehicle_name());
	     customerSearch.setCustomer_id(tcu.getVehicledeviceObj().getVehicleObj().getCustomerObj().getHidas_id());//.getCdObj().getHidas_id());
	     String hidas_id=customerSearch.getCustomer_id();
	     List<CustomerSearch> CustomerList=new ArrayList<>();
	     String reg_key=UserAuth.getAccess();
	     String Ownername=UserAuth.getOwnerName(hidas_id, reg_key);
	     customerSearch.setOwnername(Ownername);
	     CustomerList.add(customerSearch);
	     return CustomerList;
	}

	@Override
	public List<CustomerSearchEngine> getEngineDetails(int engine_id) {
		// TODO Auto-generated method stub
		
		Engine engine=engineObj.findByEngineId(engine_id).get(0);//.findByEngineId(engine_id).get(0);
		
		CustomerSearchEngine customerSearchEngine=new CustomerSearchEngine();
		customerSearchEngine.setBoatName(engine.getVehiceldeviceObj().getVehicleObj().getVehicle_name());
		customerSearchEngine.setCustomer_id(engine.getVehiceldeviceObj().getVehicleObj().getCustomerObj().getHidas_id());
		customerSearchEngine.setEngine_id(engine.getEngineId());
		customerSearchEngine.setEngine_status(engine.getEngine_status());
		//customerSearchEngine.setCustomer_id(engine.getVdObj().getvObj().getCdObj().getHidas_id());
	    String hidas_id=customerSearchEngine.getCustomer_id();
	    String reg_key=UserAuth.getAccess();
	    String Ownername=UserAuth.getOwnerName(hidas_id, reg_key);
        customerSearchEngine.setOwnername(Ownername);
	 	List<CustomerSearchEngine> CustomerList=new ArrayList<>();
	    CustomerList.add(customerSearchEngine);
	    return CustomerList;
		
		
	}	
	
}
