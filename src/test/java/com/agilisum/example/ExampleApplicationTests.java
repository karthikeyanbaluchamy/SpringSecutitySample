package com.agilisum.example;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class ExampleApplicationTests {

	
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	public void contextLoads() {
		 ResponseEntity<Map> response = testRestTemplate
	                .withBasicAuth("user", "password").getForEntity("/products/api/getproductdetails", Map.class);
		 assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	 

}
