package com.DLDev.Chefcito.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DLDev.Chefcito.models.security.AuthenticationRequest;
import com.DLDev.Chefcito.models.security.AuthenticationResponse;
import com.DLDev.Chefcito.models.security.RegisterRequest;
import com.DLDev.Chefcito.services.implementation.AuthenticationService;

@RestController
@RequestMapping("/")
public class AuthenticationController {

	private AuthenticationService authService;
	
	public AuthenticationController(AuthenticationService authService) {
		this.authService = authService;
	}

	@PostMapping("/register")
	public ResponseEntity<AuthenticationResponse> register(
			@RequestBody RegisterRequest request){
		return ResponseEntity.ok(
				authService.register(request));
	}
	
	@PostMapping("/login")
	public ResponseEntity<AuthenticationResponse> login(
			@RequestBody AuthenticationRequest request){
		return ResponseEntity.ok(
				authService.authenticate(request));

	}
}
