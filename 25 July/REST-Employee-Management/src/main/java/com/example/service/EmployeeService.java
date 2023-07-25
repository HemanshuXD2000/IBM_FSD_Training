package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);
	
	List<Employee> listEmployees();
	
	Optional<Employee> getEmployeeById(int employeeId);
}
