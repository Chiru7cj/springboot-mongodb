package com.example.mongodb.springbootmongodb.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.mongodb.springbootmongodb.model.Employee;
import com.example.mongodb.springbootmongodb.repository.EmployeeRepository;

/**
 * The type Employee controller.
 */
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepository;

	/**
	 * Save employee string.
	 *
	 * @param emp the emp
	 * @return the string
	 */
	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody Employee emp) {
		empRepository.save(emp);
		return "employee added successfully::" + emp.getId();
	}

	/**
	 * Gets employees.
	 *
	 * @return the employees
	 */
	@GetMapping("/findAllEmployees")
	public List<Employee> getEmployees() {
		return empRepository.findAll();
	}

	/**
	 * Gets employee.
	 *
	 * @param id the id
	 * @return the employee
	 */
	@GetMapping("/findEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return empRepository.findById(id);
	}

	/**
	 * Delete employee string.
	 *
	 * @param id the id
	 * @return the string
	 */
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		empRepository.deleteById(id);
		return "Deleted Employee Successfully::" + id;
	}
	

}
