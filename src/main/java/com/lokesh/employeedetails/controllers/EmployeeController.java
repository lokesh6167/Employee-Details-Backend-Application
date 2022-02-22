package com.lokesh.employeedetails.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lokesh.employeedetails.entities.Employee;
import com.lokesh.employeedetails.services.EmployeeService;

@RestController
@RequestMapping("/employeeList")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/employees")
	public List<Employee> allEmployees(){
		return service.getAllEmployees();
	}
	
	@RequestMapping("/employee/{id}")
	public Employee oneEmployee(@PathVariable("id") int id) {
		return service.getEmployee(id);
	}
	@RequestMapping(value="/addEmployee",method = RequestMethod.POST)
	public Employee insertEmployee(@RequestBody Employee employee) {
		return service.insertEmployee(employee);
	}
	@RequestMapping(value="/deleteEmployee/{id}",method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("id") int id) {
		service.deleteEmployee(id);
	}
	@RequestMapping(value="/updateEmployee/{id}",method=RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee) {
		return service.updateEmployee(id, employee);
	}
}

