package com.atmecs.one2many.entity;

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
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_id")
	private int Userid;

	@Column(name = "Name")
	private String Name;

	private UserDetails userdetails;

	 @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ud_id")

	public UserDetails getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}

	
	
	public Users() { 
		
	}

	public Users(int userid, String name, UserDetails userdetails) {
		this.Userid = userid;
		this.Name = name;
		this.userdetails = userdetails;
	}

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
