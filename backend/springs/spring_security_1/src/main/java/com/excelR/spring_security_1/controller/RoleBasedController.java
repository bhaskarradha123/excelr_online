package com.excelR.spring_security_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excelR.spring_security_1.util.JwtUtil;

@RestController
public class RoleBasedController {
	@Autowired
	JwtUtil util;
//	http://localhost:8080/authenticate?username=radha
	@PostMapping("/authenticate")
	public String genertaeTokenWhenLogin(@RequestParam String username) {
	  return util.generateToken(username);	
	}
	
	
//	http://localhost:8080/admin
    @GetMapping("/admin")
	public String adminAccess() {
		return "hi welcome admin...!!";
	}
    

    
//	http://localhost:8080/employee
    @GetMapping("/employee")
   	public String EmployeeAccess() {
   		return "hi welcome employee...!!";
   	}
    
    
//	http://localhost:8080/students
    @GetMapping("/students")
   	public String studentAccess() {
   		return "hi welcome students...!!";
   	}
}
