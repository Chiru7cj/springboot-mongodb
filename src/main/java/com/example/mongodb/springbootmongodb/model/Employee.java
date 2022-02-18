package com.example.mongodb.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The type Employee.
 */
@Document(collection = "Employee")
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String departement;

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name.
	 *
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets departement.
	 *
	 * @return the departement
	 */
	public String getDepartement() {
		return departement;
	}

	/**
	 * Sets departement.
	 *
	 * @param departement the departement
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
	

}
