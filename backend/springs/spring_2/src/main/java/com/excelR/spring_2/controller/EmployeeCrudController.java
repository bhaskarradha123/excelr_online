package com.excelR.spring_2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelR.spring_2.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeCrudController {
	
//	http://localhost:8080/employee/save
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return null;
	}
	public Employee loginEmployee() {
		return null;
	}
	public Employee updateEmployee() {
		return null;
	}
	public Employee deleteEmployee() {
		return null;
	}
	public Employee fetchEmployeeById() {
		 return null;
	}
	public Employee fetchEmployeeByEmail() {
		 return null;
	}
	public List<Employee> fetchAllEmployee() {
		 return null;
	}
}
