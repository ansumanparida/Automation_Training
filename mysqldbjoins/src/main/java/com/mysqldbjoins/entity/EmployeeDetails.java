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
@Table(name = "employee_details")
public class EmployeeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid")
	private int empid;
	
	@Column(name = "maritial_status")
	private String maritalStatus;
	
	@Column(name = "hobby")
	private String hobby;
	
	@Column(name = "salary")
	private double salary;
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "empid")
//	private EmployeeDetails employeeDetails;
	
	public EmployeeDetails() {
		
	}
	
	
	public EmployeeDetails(String maritalStatus, String hobby, double salary) {
		this.maritalStatus = maritalStatus;
		this.hobby = hobby;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empid;
	}
	
	public void setEmpId() {
		this.empid = empid;
	}
	
	public String getmaritalStatus() {
		return maritalStatus;
	}
	
	public void setmaritalStatus() {
		this.maritalStatus = maritalStatus;
	}
	public String gethobby() {
		return hobby;
	}
	public void sethobby() {
		this.hobby = hobby;
	}
	public double getsalary() {
		return salary;
		
	}
	public void setsalary() {
		this.salary = salary;
		
	}
	
	

}
