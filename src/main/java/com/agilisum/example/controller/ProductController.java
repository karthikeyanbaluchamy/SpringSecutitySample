package com.agilisum.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/api")
public class ProductController {

	@GetMapping("/getproductdetails")
	public ResponseEntity<Map<String,String>> fetchProductDetails(){
		Map<String,String> hm = new HashMap<String,String>();
		try {
			
			
			hm.put("Product","Milk,Chocolates,CoolDrinks,Rice");
			hm.put("Milk","Raw,Cows");
			hm.put("Chocolates","DiaryMilk,FiveStar");
			
			return ResponseEntity.ok(hm);
		}
		catch (Exception e) {
			// TODO: handle exception
			hm.put("Error","Error while processing the details");
			
		}
		return (ResponseEntity<Map<String, String>>) ResponseEntity.status(HttpStatus.resolve(500));
		
		
	}
	
	
}
