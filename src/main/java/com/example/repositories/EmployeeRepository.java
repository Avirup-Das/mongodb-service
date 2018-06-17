package com.example.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Employee;

@Repository
public interface EmployeeRepository  extends MongoRepository<Employee, String>
{

}