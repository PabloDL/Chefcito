package com.DLDev.Chefcito.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DLDev.Chefcito.models.security.ChangePasswordRequest;
import com.DLDev.Chefcito.services.implementation.UserService;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;
	
	public UserService getService(UserService userService) {
		return userService;
	}

	@PatchMapping
	public ResponseEntity<?> changePassword(@RequestBody ChangePasswordRequest request, Principal connectedUser) {
		userService.changePassword(request, connectedUser);
		return ResponseEntity.ok().build();
	}
}
