package com.atmecs.one2many.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "more_userdetails")
public class MoreUserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mud_id")
	private int mud_id;
	
	
	@Column(name = "job")
	private String job;
	
	@Column(name = "salary")
	private double salary;
	
	

	public MoreUserDetails() {
	
	}

	public MoreUserDetails(int mud_id, String job, double salary) {
		
		this.mud_id = mud_id;
		this.job = job;
		this.salary = salary;
	}

	public int getMud_id() {
		return mud_id;
	}

	public void setMud_id(int uD_id) {
		mud_id = mud_id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		salary = salary;
	}


}
