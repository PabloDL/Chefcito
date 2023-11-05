package com.DLDev.Chefcito.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0.1/demo-controller")
public class HomeController {

	
	@GetMapping
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("hello from secured endpoint");
	}
}
