package com.openshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openshift.entity.Employee;
import com.openshift.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

@RestController
public class ExampleController {
	
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/get")
	public String helloSay() {
		return "Hello Reddy";

	}
	
	@PostMapping
    @Operation(summary = "Save a new employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    @Operation(summary = "Get all employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
