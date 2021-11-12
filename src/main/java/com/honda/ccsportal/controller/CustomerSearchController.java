package com.honda.ccsportal.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honda.ccsportal.model.CustomerSearch;
import com.honda.ccsportal.model.CustomerSearchEngine;
import com.honda.ccsportal.model.LookUpRequest;
import com.honda.ccsportal.service.CustomerSearchServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/vehicle")
public class CustomerSearchController {
	
	
	  @Autowired
			private CustomerSearchServiceImpl customerServiceServiceImpl;

			private static final Logger logger = LoggerFactory
					.getLogger(CustomerSearchController.class);



			@ApiOperation(tags = "CustomerSearch Details", value = "fetches the list of CustomerSearch Details")
			@ApiResponses(value = { @ApiResponse(code = 200, message = "successfull operation"),
					@ApiResponse(code = 400, message = "bad request"), @ApiResponse(code = 401, message = "unauthorized"),
					@ApiResponse(code = 403, message = "forbidden"), @ApiResponse(code = 404, message = "not found"),
					@ApiResponse(code = 412, message = "HondaHeaderType is missing in the HTTP Header"),
					@ApiResponse(code = 500, message = "Internal Server Error (System Issues)"),
					@ApiResponse(code = 503, message = "Service Unavailable"),
					@ApiResponse(code = 504, message = "Failed to establish Backside connection") })
			@PostMapping(value = "/lookup", produces = { "application/json" })
			public ResponseEntity<?> customerDetails(
					@ApiParam(value = "hondaHeaderType.userId", required = true) @RequestHeader(value="hondaHeaderType.userId") String userId,
					@ApiParam(value = "hondaHeaderType.businessId", required = true) @RequestHeader(value = "hondaHeaderType.businessId") String businessId,
					@ApiParam(value = "hondaHeaderType.collectedTimestamp", required = true) @RequestHeader(value = "hondaHeaderType.collectedTimestamp") String collectedTimestamp,
					@ApiParam(value = "hondaHeaderType.country_code", required = true) @RequestHeader(value = "hondaHeaderType.country_code") String country_code,
					@ApiParam(value = "hondaHeaderType.language_code", required = true) @RequestHeader(value = "hondaHeaderType.language_code") String language_code,
					@ApiParam(value = "hondaHeaderType.messageId", required = true) @RequestHeader(value = "hondaHeaderType.messageId")  String messageId,
					@ApiParam(value = "hondaHeaderType.siteId", required = true) @RequestHeader(value = "hondaHeaderType.siteId") String siteId,
					@ApiParam(value = "hondaHeaderType.systemId", required = true) @RequestHeader(value = "hondaHeaderType.systemId") String systemId,
			        @RequestBody LookUpRequest lookUpRequest)	
			{
				HttpHeaders responseHeaders = new HttpHeaders();
				responseHeaders.set("hondaHeaderType.messageId", messageId.toString());
				responseHeaders.set("hondaHeaderType.systemId", systemId);
				responseHeaders.set("hondaHeaderType.country_code", country_code);
				responseHeaders.set("hondaHeaderType.language_code", language_code);
				responseHeaders.set("hondaHeaderType.siteId", siteId);
				responseHeaders.set("hondaHeaderType.businessId", businessId);
				logger.info("CustomerSearch Details");  
				try {
					if(!lookUpRequest.getTcuSerial().isEmpty())	
					{
						List<CustomerSearch> customer=new ArrayList<>();  
						customer=customerServiceServiceImpl.getTcuSerialNumber(lookUpRequest.getTcuSerial());
						return new ResponseEntity<>(customer,responseHeaders,HttpStatus.OK);
					}

				else if(!lookUpRequest.getEngineNumber().isEmpty())
					{
						List<CustomerSearchEngine> customer=new ArrayList<>();
						
                          customer=customerServiceServiceImpl.getEngineDetails(Integer.parseInt(lookUpRequest.getEngineNumber()));//.getEngineDetails(lookUpRequest.getEngineNumber());
      					  return new ResponseEntity<>(customer,responseHeaders,HttpStatus.OK);
					} 
					
					else if(lookUpRequest.getEngineNumber().isEmpty() && lookUpRequest.getTcuSerial().isEmpty()) {
						List<String> result=new ArrayList<>();
						result.add("please enter any value!!");
    					return new ResponseEntity<>(result,responseHeaders,HttpStatus.OK);

					}
					
					else {
						List<String> result=new ArrayList<>();
						result.add("enter a valid value!!");
    					return new ResponseEntity<>(result,responseHeaders,HttpStatus.OK);

					}

				} catch (Exception e) {
					logger.error("Exception in ContentManagementController tipDetails ::: " + e);
					return new ResponseEntity<>("Enter a valid tcu or engine value",responseHeaders, HttpStatus.EXPECTATION_FAILED);
				}
				
				
			}
			
			@GetMapping(value = "/helloccs", produces = { "application/json" })
			public String helloCcs() {
				return "hi welcome!";
			}

}
