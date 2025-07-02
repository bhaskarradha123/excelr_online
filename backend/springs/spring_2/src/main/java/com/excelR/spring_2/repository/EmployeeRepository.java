package com.excelR.spring_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelR.spring_2.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

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
