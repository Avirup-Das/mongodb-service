package com.example.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employees")
public class Employee implements Serializable
{	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String empId;
	private String name;	
	private String designation;
	private double salary;

	public Employee()  
	{
		
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDesignation() 
	{
		return designation;
	}
	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public String getEmpId() 
	{
		return empId;
	}
	public void setEmpId(String empId) 
	{
		this.empId = empId;
	}
	public String toString()
	{
		return "[Name:"+name+" | Designation:"+designation+" | Salary:"+salary+" | Emp ID:"+empId+"]";
	}
}