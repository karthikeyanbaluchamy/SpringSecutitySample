package com.agilisum.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/config/api")
public class configController {
	
	@GetMapping("/getconfigdetails")
	public ResponseEntity<Map<String,String>> fetchConfigDetails(){
		Map<String,String> hm = new HashMap<String,String>();
		try {
			
			
			hm.put("SampleConfiguration","1000 liters of milk sales per day");
			hm.put("Chocldates","Details are empty");
			
			
			return ResponseEntity.ok(hm);
		}
		catch (Exception e) {
			// TODO: handle exception
			hm.put("Error","Error while processing the details");
			
		}
		return (ResponseEntity<Map<String, String>>) ResponseEntity.status(HttpStatus.resolve(500));
		
		
	}

}
