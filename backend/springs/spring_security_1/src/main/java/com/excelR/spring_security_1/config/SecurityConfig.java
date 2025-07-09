package com.excelR.spring_security_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.excelR.spring_security_1.util.JwtAuthenticationFilter;

@Configuration
public class SecurityConfig {
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity security,
			JwtAuthenticationFilter filter) throws Exception {
		security
		.csrf(AbstractHttpConfigurer::disable)
		.authorizeHttpRequests(auth->
		           auth.requestMatchers("/authenticate").permitAll()
		               .requestMatchers("/admin").hasRole("ADMIN")
		               .requestMatchers("/employee").hasRole("EMPLOYEE")
		               .requestMatchers("/students")
		               .permitAll()
		               .anyRequest().authenticated()
				)
		.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
		.httpBasic();
		
		return security.build();
	}
}
