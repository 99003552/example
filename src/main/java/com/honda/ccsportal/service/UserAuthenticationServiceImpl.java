package com.honda.ccsportal.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.honda.ccsportal.model.ClientDetails;

//import org.json.*;




@Service

public class UserAuthenticationServiceImpl {
	
	   @Autowired
	   private RestTemplateBuilder restTemplate;
	   
		@Value(value="${client_id}")
        private String clientId;
		
		@Value(value="${client_secret}")
		public String clientSecret;
	
	public String getAccess()
	{
		
		
		//ClientRegistration clientRegistration=  restTemplate.build().postForObject("https://prestage.identity.services.honda.com/hidas/rs/client/register", null, ClientRegistration.class);
        //return List.of(clientRegistration);
        
         HttpHeaders headers =new HttpHeaders();//new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("client_id",clientId);//ClientDetails.clientId);// "h0ndALinkCcS2maR1ne843");
        map.add("client_secret",clientSecret);//ClientDetails.clientSecret);//);

        HttpEntity<MultiValueMap<String, String>> request =new  HttpEntity<MultiValueMap<String, String>>(map,headers);// new HttpEntity<MultiValueMap<String, String>>(map, headers);

        String response = restTemplate.build().postForObject( "https://prestage.identity.services.honda.com/hidas/rs/client/register", request , String.class );
    
        JSONObject json = new JSONObject(response);
        
       System.out.println(clientId);
       
       
       JSONObject js=json.getJSONObject("clientregistrationkey");
       
       String reg_key=js.getString("client_reg_key");
       
        return reg_key;
      
	}
	
	 public String getOwnerName(String hidas_id,String reg_key)
	   {
		   
		   HttpHeaders headers =new HttpHeaders();//new HttpHeaders();
	       headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

	       MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
	       map.add("client_reg_key",reg_key);
	       map.add("hidas_ident",hidas_id);
	       map.add("return_attributes","firstname,lastname");

	       HttpEntity<MultiValueMap<String, String>> request =new  HttpEntity<MultiValueMap<String, String>>(map,headers);// new HttpEntity<MultiValueMap<String, String>>(map, headers);

	       String response = restTemplate.build().postForObject( "https://prestage.identity.services.honda.com/hidas/rs/user/query", request , String.class );
	       
	       
	       JSONObject json = new JSONObject(response);
	       
	     //  System.out.println(json.toString());
	               
	       String Ownername="";
	     //  ArrayList<String> names = new ArrayList<String>();
	       JSONArray name = json.getJSONArray("users");
	       for (int i = 0; i < name.length(); i++) {
	       	Ownername+=name.getJSONObject(i).getString("first_name");
	       }
	       for (int i = 0; i < name.length(); i++) {
	       	Ownername+=" "+name.getJSONObject(i).getString("last_name");
	       }
		  
	       return Ownername;
	   }

}
