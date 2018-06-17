package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.models.Employee;
import com.example.services.EmployeeService;

@RestController
public class EmployeeController
{
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path="/admission")
	public ModelAndView getAdmissionForm() throws Exception
	{
		System.out.println("Inside controller");
		return new ModelAndView("admissionForm");			
	}
	
	@PostMapping(path= "/add")
	public void add(Employee employee)
	{		
		employeeService.add(employee);
	}
	@GetMapping(path="/all")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	@GetMapping(path="/all/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id)
	{
		return employeeService.getEmployeeId(id);
	}
	@PutMapping(path="/all/{id}", consumes="application/json")
	public void updateEmployee(@PathVariable("id") String id, Employee employee)
	{
		System.out.println("Controller employee:"+employee);
		employeeService.updateEmployee(id, employee);
	}
	@DeleteMapping(path="/all/{id}")
	public void deleteEmployee(@PathVariable("id") String id)
	{
		employeeService.deleteEmployee(id);
	}
}