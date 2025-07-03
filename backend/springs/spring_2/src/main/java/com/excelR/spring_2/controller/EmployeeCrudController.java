package com.excelR.spring_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excelR.spring_2.dao.EmployeeDao;
import com.excelR.spring_2.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeCrudController {

	@Autowired
	EmployeeDao dao;

//	http://localhost:8080/employee/save
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return dao.saveEmployee(employee);
	}
	
//  http://localhost:8080/employee/login
	@PostMapping("/login")
	public Employee loginEmployee(@RequestBody Employee employee) {
		Employee db = dao.fetchByEmail(employee.getEmail());
		if(db!=null) {
			if(db.getPwd().equals(employee.getPwd())) {
				return db;
			}else {
				System.out.println("pwd mismatch");
				return null;//pwd mismatch
			}
		}
		else {
			System.out.println(" email wrong");
			return null;//email not found}

		}
	}

	
	
//	 http://localhost:8080/employee/update
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return dao.updateEmployee(employee);
	}

	
//	 http://localhost:8080/employee/delete/101
	@DeleteMapping("/delete/{id}")
	public Employee deleteEmployee(@PathVariable int id) {
	   return dao.deleteEmployee(id);
	}

	
// http://localhost:8080/employee/fetchById?id=1001
	@GetMapping("/fetchById")
	public Employee fetchEmployeeById(@RequestParam int id) {
		Employee em = dao.fetchById(id);
		if (em != null)
			return em;
		else
			return null;
	}

//	http://localhost:8080/employee/fetchByEmail/radha@gmail.com
	@GetMapping("/fetchByEmail/{email}")
	public Employee fetchEmployeeByEmail(@PathVariable String email) {
		return dao.fetchByEmail(email);
	}

//	http://localhost:8080/employee/fetchAll
	@GetMapping("/fetchAll")
	public List<Employee> fetchAllEmployee() {
		List<Employee> res = dao.fetchAllEmployee();
		if(!res.isEmpty())
			return res;
		else
			return null;
	}
	
	
}
