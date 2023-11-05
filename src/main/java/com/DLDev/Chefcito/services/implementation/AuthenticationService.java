package com.DLDev.Chefcito.services.implementation;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.DLDev.Chefcito.entities.User;
import com.DLDev.Chefcito.helpers.Role;
import com.DLDev.Chefcito.models.AuthenticationRequest;
import com.DLDev.Chefcito.models.AuthenticationResponse;
import com.DLDev.Chefcito.models.RegisterRequest;
import com.DLDev.Chefcito.repositories.IUserRepository;

@Service
public class AuthenticationService {

	private IUserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	private JwtService jwtService;
	private AuthenticationManager authManager;

	public AuthenticationService(IUserRepository userRepository, PasswordEncoder passwordEncoder,
			JwtService jwtService,AuthenticationManager authManager) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.jwtService = jwtService;
		this.authManager = authManager;
	}

	public AuthenticationResponse register(RegisterRequest request) {
		var user = new User(request.getFirstName(), request.getLastName(), "", request.getEmail(),
				passwordEncoder.encode(request.getPassword()), Role.USER, true);
		// TODO fix:use correct fields and fix constructor
		userRepository.save(user);
		
		
		return new AuthenticationResponse(jwtService.generateToken(user));
	}

	public AuthenticationResponse authenticate(AuthenticationRequest request) {
		//TODO manage exceptions
		authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword()));
		
		var user = userRepository.findByEmail(request.getEmail())
				.orElseThrow();
		
		return new AuthenticationResponse(jwtService.generateToken(user));
	}

}
