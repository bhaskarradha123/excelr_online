package com.excelR.spring_2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
//  http://localhost:8080/employee/login
	@PostMapping("/login")
	public Employee loginEmployee(@RequestBody Employee employee) {
		System.out.println(employee.getEmail()+" "+ employee.getPwd());
		return null;
	}
//	 http://localhost:8080/employee/update
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return null;
	}
//	 http://localhost:8080/employee/delete/101
	@DeleteMapping("/delete/{id}")
	public Employee deleteEmployee(@PathVariable int id) {
		System.out.println(id);
		return null;
	}
// http://localhost:8080/employee/fetchById?id=1001
	@GetMapping("/fetchById")
	public Employee fetchEmployeeById(@RequestParam int id) {
		System.out.println(id);
		 return null;
	}
//	http://localhost:8080/employee/fetchByEmail/radha@gmail.com
	@GetMapping("/fetchByEmail/{email}")
	public Employee fetchEmployeeByEmail(@PathVariable String email) {
		System.out.println(email);
		 return null;
	}
//	http://localhost:8080/employee/fetchAll
	@GetMapping("/fetchAll")
	public List<Employee> fetchAllEmployee() {
		 return null;
	}
}
