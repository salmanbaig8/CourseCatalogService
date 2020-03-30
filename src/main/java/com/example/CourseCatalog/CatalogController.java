package com.example.CourseCatalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("Catalog")
public class CatalogController {

	private String url = "http://localhost/8080/Course";
	private String courseAppMessage = "";
	@GetMapping("/")
	public String getCatalogHome(){
		RestTemplate restTemplate = new RestTemplate();
		courseAppMessage = restTemplate.getForObject(url, String.class);
		return courseAppMessage;
	}
		
}
