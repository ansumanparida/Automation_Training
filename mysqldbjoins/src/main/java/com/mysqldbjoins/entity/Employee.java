package com.mysqldbjoins.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid")
	private int empid;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "dept")
	private String dept;
	
	@Column(name = "email")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empid")
	private EmployeeDetails employeeDetails;
	
	public Employee() {
		
	}
	
	
	public Employee(String firstName, String lastName, String dept, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
		this.email = email;
	}
	
	public int getEmpId() {
		return empid;
	}
	
	public void setEmpId() {
		this.empid = empid;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName() {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName() {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return dept;
		
	}
	public void setDepartment() {
		this.dept = dept;
		
	}
	
	public String getEmail() {
		return email;
		
	}
	public void setEmail() {
		this.email = email;
	}
	
}
