package com.honda.ccsportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.honda.ccsportal.entity.Customer;
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
	public Customer getTcuSerialNumber(String serialNumber) {
		// TODO Auto-generated method stub
		Tcu tcu=tcuObj.findBySerialNumber(serialNumber).get(0);
		return tcu.getVdObj().getvObj().getCdObj();
	}
}
