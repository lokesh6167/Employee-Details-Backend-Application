package com.lokesh.employeedetails.repos;

import org.springframework.data.repository.CrudRepository;

import com.lokesh.employeedetails.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
}
