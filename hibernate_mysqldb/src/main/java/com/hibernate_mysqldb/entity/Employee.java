package com.hibernate_mysqldb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "fullname")
	private String fullName;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "salary")
	private double salary;
	
	public Employee() {
		
	}
	
	
	public Employee(String fullName, String designation, double salary) {
		this.fullName = fullName;
		this.designation = designation;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		this.id = id;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName() {
		this.fullName = fullName;
	}
	
	public String getDesignation() {
		return designation;
		
	}
	public void setDesignation() {
		this.designation = designation;
		
	}
	
	public double getSalary() {
		return salary;
		
	}
	public void setSalary() {
		this.salary = salary;
	}
	
}
