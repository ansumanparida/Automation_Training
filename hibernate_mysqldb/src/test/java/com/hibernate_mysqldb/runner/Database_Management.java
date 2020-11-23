package com.hibernate_mysqldb.runner;

import java.util.Scanner;

import com.hibernate_mysqldb.operation.AddEmployee;
import com.hibernate_mysqldb.operation.ReadEmployee;
import com.hibernate_mysqldb.operation.RemoveEmployee;
import com.hibernate_mysqldb.operation.UpdateEmployee;

public class Database_Management {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int choice;
		
		do {
		System.out.println("Enter the operation you want to perform");
		System.out.println("1.Write New Employee Data \n2.Read Employee Data \n3.Modify Employee Data\n4.Delete Employee Data\n5.Exit");
		Scanner userInput=new Scanner(System.in);
		choice=userInput.nextInt();

		switch (choice) {
		case 1:
		AddEmployee add = new AddEmployee();
		add.addEmployeeData();
		case 2:
		ReadEmployee read = new ReadEmployee();
		read.readEmployeeData();
		case 3:
		UpdateEmployee modify = new UpdateEmployee();
		modify.updateEmployeeData();

		case 4:
		RemoveEmployee delete = new RemoveEmployee();
		delete.removeEmployeeData();

		case 5:
		System.out.println("Thank You");
		break;

		default:
		System.out.println("Wrong Input... Please Enter Any Number From Menu");
		break;
		}
		} while (choice != 5);
		}

}
