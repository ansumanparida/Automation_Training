package com.Employee_Recorder;

public class Employees {
	

		int id;
		String name;
		String department;
		String designation;
	    String salary;
	    double contact_no;
	    String address;
	    
		public Employees(int id, String name, String department, String designation,String salary,double contact_no,String address) {

			this.id = id;
			this.name = name;
			this.department = department;
			this.designation = designation;
			this.salary=salary;
			this.contact_no=contact_no;
			this.address=address;
		}

		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public double getContact() {
			return contact_no;
			
		}
		public void setContact(double contact_no) {
			this.contact_no = contact_no;
			
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "[id=" + id + "| name=" + name + "| department=" + department + "| designation=" + designation +"| salary=" + salary+ "| contact_no=" + contact_no+ "| address=" + address+ "]";
		}

	}



