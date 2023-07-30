package com.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.entity.Users;

@Component
public class RegisterService {
	
	public void saveUser(Users user, String method) {
		String query_url = "http://localhost:8089/App2Assignment5/users";
		String json = "{\"uname\":\""+user.getUname()+"\",\"pass\":\""+user.getPass()+"\"}";
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		HttpEntity<String> requestEntity = new HttpEntity<String>(json, headers);
		
		try {
			if (method.equals("POST")) {
				restTemplate.postForEntity(query_url, requestEntity, String.class);
				System.out.println("User created successfully!");
			} else if (method.equals("PUT")) {
				restTemplate.exchange(query_url, HttpMethod.PUT, requestEntity, String.class);
				System.out.println("User updated successfully!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
