package com.hibernate_mysqldb.operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate_mysqldb.entity.Employee;

public class ReadEmployee {

	public void readEmployeeData() {
		
	
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			session.beginTransaction();
			
//			System.out.println("Enter ID to Search Employee. ");
//			Scanner sc = new Scanner(System.in);
//			int id = sc.nextInt();
			int id=1;
			
			//add employee to data
			Employee employee = session.get(Employee.class, id);
			
			System.out.println("employee::" +employee);
			session.getTransaction().commit();
			
		}catch (SessionException e) {
			
		}finally {
			session.close();
			factory.close();
		}
	}

	
		
}
