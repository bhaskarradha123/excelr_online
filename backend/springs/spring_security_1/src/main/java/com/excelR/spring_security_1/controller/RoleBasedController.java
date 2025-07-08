package com.excelR.spring_security_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleBasedController {
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
}
