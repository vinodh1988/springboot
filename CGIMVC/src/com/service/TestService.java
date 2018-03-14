package com.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
 
	public String sendData(){
		return "Data sent from the service";
	}
}
