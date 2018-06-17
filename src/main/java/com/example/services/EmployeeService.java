package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Utilities;
import com.example.repositories.EmployeeRepository;
import com.example.models.Employee;

@Service
public class EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;

	public void add(Employee employee)	
	{
		String id = Utilities.getId(employee.getName());
		employee.setEmpId(id);
		employeeRepository.save(employee);
	}
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	public Employee getEmployeeId(String id)
	{
		return employeeRepository.findOne(id);
	}
	public void updateEmployee(String id, Employee employee)
	{
		System.out.println("Service employee:"+employee);
		employeeRepository.save(employee);
	}
	public void deleteEmployee(String id)
	{
		employeeRepository.delete(id);
	}
}