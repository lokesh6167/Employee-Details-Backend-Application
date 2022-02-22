package com.lokesh.employeedetails.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lokesh.employeedetails.entities.Employee;
import com.lokesh.employeedetails.repos.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public Employee insertEmployee(Employee emp) {
		return repo.save(emp);
	}
	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}
	public List<Employee> getAllEmployees(){
		return (List<Employee>) repo.findAll();
	}
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}
	public Employee updateEmployee(int id,Employee employee) {
		Employee emp=repo.findById(id).get();
		employee.setId(emp.getId());
		return repo.save(employee);
	}
}
