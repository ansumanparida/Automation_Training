package com.hibernate_mysqldb.operation;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate_mysqldb.entity.Employee;

public class RemoveEmployee {
	public void removeEmployeeData() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			int id = 2;
			
			//add employee to data
			Employee employee = session.load(Employee.class,id);
			session.delete(employee);
			
			System.out.println("employee::" +employee);
			session.getTransaction().commit();
			
		}catch (SessionException e) {
			
		}finally {
			session.close();
			factory.close();
		}
	}

}
