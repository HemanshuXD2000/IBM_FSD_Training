package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);
	
	List<Employee> listEmployees();
	
	Optional<Employee> getEmployeeById(int employeeId);
	
	Employee updateEmployeeById(Employee employee);
	
	void deleteEmployee(int employeeId);
	
	List<Employee> findByFirstName(String firstName);
	
	List<Employee> findByFirstNameOrLastName(String firstName, String lastName);
	
	List<Employee> findByFirstNameAndLastName(String firstName, String lastName);
}
