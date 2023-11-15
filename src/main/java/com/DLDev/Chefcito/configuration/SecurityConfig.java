package com.DLDev.Chefcito.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.AuthorizeRequestsDsl;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.DLDev.Chefcito.services.implementation.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	private JwtAuthenticationFilter jwtAuthFilter;

	private AuthenticationProvider authProvider;

	public SecurityConfig(JwtAuthenticationFilter jwtAuthFilter, AuthenticationProvider authProvider) {
		super();
		this.jwtAuthFilter = jwtAuthFilter;
		this.authProvider = authProvider;
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http
			.csrf().disable()
			.authorizeHttpRequests()
			.requestMatchers("/api/v0.1/auth/**")
			.permitAll()
			.anyRequest().authenticated()
			.and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and()
			.authenticationProvider(authProvider)
			.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
			
		
		return http.build();
	}
	
//	@Bean
//	@Order(1)
//	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		return http
//
//				.csrf(AbstractHttpConfigurer::disable)
//				.cors(AbstractHttpConfigurer::disable)
//				.build();
//	}
//	
//	@Bean
//	@Order(2)
//	SecurityFilterChain apiSecurityFilterChain(HttpSecurity http) throws Exception {
//		return http
//				.authorizeHttpRequests(auth -> {
//					auth.requestMatchers("/api/**").hasRole("ADMIN");
//					auth.anyRequest().authenticated();
//				})
//				.sessionManagement(session -> 
//					session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//				.build();
//	}
//
//	@Bean
//	@Order(3)
//	SecurityFilterChain loginSecurityFilterChain(HttpSecurity http) throws Exception {
//		return http
//				.authorizeHttpRequests(auth ->{
//					auth.requestMatchers("/", "/login", "/register", "/error" ).permitAll();
//					auth.anyRequest().authenticated();
//				})
//				.formLogin(form -> form
//						.loginPage("/login").permitAll())
//				.build();
//	}
//

}
