package com.excelR.spring_2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.excelR.spring_2.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
//   @Query("select a from Employee  a where email=?1")
	Optional<Employee> findByEmail(String email); //custom method to fetch based on email
}
//i--i  --extends
//i--c---implements
//c--c  --extends

/*
 * *      CrudRepository---i 
 *            |
 *            |
 *        ListCrudRepositoy--i
 *            |
 *            |
 *        JpaRepository--i
 *            |
 *            |
 *         EmployeeRepository-i
 * 
 */
