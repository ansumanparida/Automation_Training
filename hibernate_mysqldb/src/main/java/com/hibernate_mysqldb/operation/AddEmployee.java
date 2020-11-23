package com.hibernate_mysqldb.operation;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate_mysqldb.entity.Employee;

public class AddEmployee {
	public void addEmployeeData() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			//add employee to data
			Employee emp1 = new Employee("Sudipta Sen","Dentist",50000.00);
			
			session.save(emp1);
			session.getTransaction().commit();
			
		}catch (SessionException e) {
			
		}finally {
			session.close();
			factory.close();
		}
	}

}
