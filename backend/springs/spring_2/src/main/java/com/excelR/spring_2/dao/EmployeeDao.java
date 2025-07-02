package com.excelR.spring_2.dao;//data access layer -- db logic

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.excelR.spring_2.model.Employee;
import com.excelR.spring_2.repository.EmployeeRepository;

//@Component
@Repository
public class EmployeeDao {
   
	@Autowired  // injecting object into reference
	EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	
}
