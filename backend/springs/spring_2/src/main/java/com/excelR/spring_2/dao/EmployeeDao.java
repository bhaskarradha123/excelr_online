package com.excelR.spring_2.dao;//data access layer -- db logic

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.excelR.spring_2.model.Employee;
import com.excelR.spring_2.repository.EmployeeRepository;

//@Component
@Repository
public class EmployeeDao {

	@Autowired // injecting object into reference
	EmployeeRepository repository;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public Employee fetchById(int id) {
		Optional<Employee> rs = repository.findById(id);
		if (rs.isPresent())
			return rs.get();
		else
			return null;
	}

	public Employee deleteEmployee(int id) {
		Optional<Employee> rs = repository.findById(id);
		if (rs.isPresent()) {
			Employee emp = rs.get();
			repository.delete(emp);
			return  emp;
		}
		else
			return null;
	}

	
	public List<Employee>fetchAllEmployee(){
		return repository.findAll();
	}
	
	public Employee fetchByEmail(String email) {
		Optional<Employee> rs = repository.findByEmail(email);
		if (rs.isPresent()) {
			Employee emp = rs.get();
			return  emp;
		}
		else
			return null;
	}
	
	
}
