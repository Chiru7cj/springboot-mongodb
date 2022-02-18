package com.example.mongodb.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mongodb.springbootmongodb.model.Employee;

/**
 * The interface Employee repository.
 */
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
