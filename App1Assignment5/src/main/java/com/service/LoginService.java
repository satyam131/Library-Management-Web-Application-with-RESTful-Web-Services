package com.service;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class LoginService {
	
	public boolean checkLogin(String uname, String pass) {
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8089/App2Assignment5/users/" + uname;
		
		try {
			String response = restTemplate.getForObject(url, String.class);
			System.out.println("\nJSON Response in String format");
			System.out.println(response);
			
			JSONParser parse = new JSONParser();
			JSONObject jobj = (JSONObject) parse.parse(response);
			String password = (String) jobj.get("pass");
			
			if (password.equals(pass)) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
