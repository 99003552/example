package com.honda.ccsportal.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.honda.ccsportal.entity.Customer;
import com.honda.ccsportal.entity.CustomerSearch;
import com.honda.ccsportal.entity.Tcu;
import com.honda.ccsportal.entity.Vehicle;
import com.honda.ccsportal.entity.VehicleDevice;
import com.honda.ccsportal.repository.TcuRepository;



@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase

public class CustomerSearchServiceImplTest {
	
	@Autowired
	CustomerSearchServiceImpl customerSearchService;
	
	@Autowired
	private TcuRepository customerSearchObj;
	
	@Test
	public void test()
	{
	String serialNumber="TC_1234";

		
     Customer customer=new Customer();
     customer.setCustomer_id(1111);
     customer.setCountry_code("US-EN");
     customer.setCreated_by("client");
     customer.setCreated_ts(Timestamp.valueOf("2012-08-05 14:02:41.548-05:00"));
     customer.setCust_bucket_name("bucket");
     customer.setCust_image_key("image");
     customer.setHidas_id("hidas_1");
     customer.setMobile_number("+91345678901");
     customer.setStatus("Active");
     customer.setUpdated_by("customer");
     
     Vehicle vehicle=new Vehicle();
     vehicle.setVehicle_id(111);
     vehicle.setVehicle_hin("US_1222");
     vehicle.setCountry_code("US-EN");
     vehicle.setCreated_by("client");
     vehicle.setCreated_ts(Timestamp.valueOf("2012-08-05 14:02:41.548-05:00"));
     vehicle.setCustomer_id(1111);
     vehicle.setDefault_vehicle(true);
     vehicle.setDoor_alarm_enable(false);
     vehicle.setDoor_alarm_from(Timestamp.valueOf("2012-08-05 14:02:41.548-05:00"));
     vehicle.setDoor_alarm_to(Timestamp.valueOf("2012-09-05 14:02:41.548-05:00"));
     vehicle.setEngine_count(4);
     vehicle.setImg_bucket_name("image");
     vehicle.setModel_id(1);
     vehicle.setUpdated_by("customer");
     vehicle.setVehicle_image_key("vehicle image");
     vehicle.setVehicle_length(500);
     vehicle.setVehicle_name("boat");
     vehicle.setVehicle_uuid("gsahk");
     vehicle.setCdObj(customer);
     
     VehicleDevice vehicleDevice=new VehicleDevice();
     vehicleDevice.setCreated_by("client");
     vehicleDevice.setCreated_ts(Timestamp.valueOf("2012-08-05 14:02:41.548-05:00"));
     vehicleDevice.setDevice_type("boat");
     vehicleDevice.setUpdated_by("customer");
     vehicleDevice.setUpdated_ts(Timestamp.valueOf("2012-09-05 14:02:41.548-05:00"));
     vehicleDevice.setDevice_id(1111);
     vehicleDevice.setVehicle_id(111);
     vehicleDevice.setvObj(vehicle);
     
     Tcu tcu=new Tcu();
     tcu.setDeviceId(1111);
     tcu.setTcu_id("Sea123");
     tcu.setTcuStatus("Active");
     tcu.setVdObj(vehicleDevice);
     tcu.setSerialNumber("TC_1234");
     tcu.setCreatedDate(Date.valueOf("2012-08-05"));
     tcu.setCreateNm("client");
     tcu.setFirmwareLastUpdate(Timestamp.valueOf("2012-09-05 14:02:41.548-05:00"));
     tcu.setFirmwareVerssion("12.0");
     tcu.setHardwareVerssion(4);
     tcu.setSimIccid("dffasgh23647");
     
     Tcu tcuObj=customerSearchObj.findBySerialNumber(serialNumber).get(0);
     
     
    /* CustomerSearch customerSearch=new CustomerSearch();
     customerSearch.setTcu_id("1111");
     customerSearch.setSerialNumber("TC_1234");
     customerSearch.setTcu_status("Active");
     customerSearch.setHullnumber("dfajyrh");
     customerSearch.setBoatName("SeaShore");
     customerSearch.setCustomer_id(1);*/
     
     
     CustomerSearch customerSearch=new CustomerSearch();
     customerSearch.setTcu_id(tcuObj.getTcu_id());
     customerSearch.setSerialNumber(tcuObj.getSerialNumber());
     customerSearch.setTcu_status(tcuObj.getTcuStatus());
     customerSearch.setHullnumber(tcuObj.getVdObj().getvObj().getVehicle_hin());
     customerSearch.setBoatName("SeaShore");
     customerSearch.setCustomer_id(tcuObj.getVdObj().getvObj().getCdObj().getCustomer_id());
     
     List<CustomerSearch> CustomerList=new ArrayList<>();
     
     CustomerList.add(customerSearch);
     
     
     when(customerSearchService.getTcuSerialNumber(serialNumber)).thenReturn(CustomerList);
	 List<CustomerSearch> response =customerSearchService.getTcuSerialNumber(serialNumber);// customerService.getcustomerDetails("test honda_id");
	 assertEquals("SeaShore",response.get(0).getBoatName());
     

		
	}

	/*String serialNumber="Tc_4567";
    List<CustomerSearch> customerSearch=new ArrayList<>();
    CustomerSearch csObj=new CustomerSearch();
    Tcu tcu=new Tcu();
    
    tcu.setDeviceId(111);
    tcu.setFirmwareVerssion("firmware");
    tcu.setTcu_id("Tc_1234");
    tcu.setDeviceId(1234);
    tcu.setSerialNumber("Tc_4567");
    
    Tcu tcuObj=customerSearchObj.findBySerialNumber(serialNumber).get(0);
    csObj.setTcu_id(tcu.getTcu_id());
    csObj.setSerialNumber(tcu.getSerialNumber());
    csObj.setTcu_status(tcu.getTcuStatus());
    csObj.setHullnumber(tcu.getVdObj().getvObj().getVehicle_hin());
	csObj.setBoatName(null);
	csObj.setCustomer_id(tcu.getVdObj().getvObj().getCdObj().getCustomer_id());
	//customerSearch.addAll(csObj);
	*/
}
