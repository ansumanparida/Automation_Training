package com.atmecs.one2many.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ud_id")
	private int ud_id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "gender")
	private String gender;
	
	@OneToOne(mappedBy = "user_details", cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})

	public UserDetails() {
	
	}

	public UserDetails(int uD_id, String email, String gender) {
		
		this.ud_id = ud_id;
		this.email = email;
		this.gender = gender;
	}

	public int getUd_id() {
		return ud_id;
	}

	public void setUd_id(int ud_id) {
		this.ud_id = ud_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	

}