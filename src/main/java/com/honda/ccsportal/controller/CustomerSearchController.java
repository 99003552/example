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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honda.ccsportal.entity.CustomerSearch;
import com.honda.ccsportal.service.TcuServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/vehicle")
public class CustomerSearchController {
	
	
	  @Autowired
			private TcuServiceImpl tcuServiceImpl;

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
			@GetMapping(value = "/lookup", produces = { "application/json" })
			public ResponseEntity<?> SimDetails(
					@ApiParam(value = "hondaHeaderType.userId", required = true) @RequestHeader(value="hondaHeaderType.userId") String userId,
					@ApiParam(value = "hondaHeaderType.businessId", required = true) @RequestHeader(value = "hondaHeaderType.businessId") String businessId,
					@ApiParam(value = "hondaHeaderType.collectedTimestamp", required = true) @RequestHeader(value = "hondaHeaderType.collectedTimestamp") String collectedTimestamp,
					@ApiParam(value = "hondaHeaderType.country_code", required = true) @RequestHeader(value = "hondaHeaderType.country_code") String country_code,
					@ApiParam(value = "hondaHeaderType.language_code", required = true) @RequestHeader(value = "hondaHeaderType.language_code") String language_code,
					@ApiParam(value = "hondaHeaderType.messageId", required = true) @RequestHeader(value = "hondaHeaderType.messageId")  String messageId,
					@ApiParam(value = "hondaHeaderType.siteId", required = true) @RequestHeader(value = "hondaHeaderType.siteId") String siteId,
					@ApiParam(value = "hondaHeaderType.systemId", required = true) @RequestHeader(value = "hondaHeaderType.systemId") String systemId,
			        @RequestBody String serialNumber)
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
					List<CustomerSearch> customer=new ArrayList<>();
					customer=tcuServiceImpl.getTcuSerialNumber(serialNumber);
					return new ResponseEntity<>(customer,responseHeaders,HttpStatus.OK);
				} catch (Exception e) {
					logger.error("Exception in ContentManagementController tipDetails ::: " + e);
					return new ResponseEntity<>(responseHeaders, HttpStatus.EXPECTATION_FAILED);
				}
			}

}
