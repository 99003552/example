package com.honda.ccsportal.model;

import org.springframework.beans.factory.annotation.Value;

public class ClientDetails {
	
	@Value(value="${client_id}")
	public static  String clientId;
	
	@Value(value="${client_secret}")
	public static String clientSecret;
	
	
	/*public static String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public static String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}*/

}
