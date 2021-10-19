package com.honda.ccsportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.honda.ccsportal.entity.Tcu;

@Repository

public interface TcuRepository extends JpaRepository<Tcu,String>{
	
	public List<Tcu> findBySerialNumber(String serialNumber);
	

}
