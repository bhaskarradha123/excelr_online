package com.excelR.spring_security_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {
		security
		.csrf()
		.disable()
		.authorizeHttpRequests(auth->
		           auth.requestMatchers("/admin").hasRole("ADMIN")
		               .requestMatchers("/employee").permitAll()
		               .anyRequest().authenticated()
				).httpBasic();
		
		return security.build();
	}
}
