package com.Employee_Recorder;

import java.io.PrintStream;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
public class Employee_Runner {
	

	

		public static void main(String[] args) throws IOException {
			int selection;
			Scanner sc = new Scanner(System.in);
			Record_Manage manage = new Record_Manage();
			do {
				System.out.println("** Employee Record Management **\n");
				System.out.println(
						" Enter Your Choice \n\n 1. Add New Record. \n 2. Print All Records into a File. \n 3. Delete a Record. \n 4. Search Employee Record. \n 5. Modify an Employee Records. \n 6. Read Employee Data From File. \n 7. Show All Employee Records. \n 8. Exit Application. ");
				selection = sc.nextInt();
				switch (selection) {
				case 1:
					System.out.println("Enter Employee Id: ");
					int id = sc.nextInt();
					System.out.println("Enter Employee Name: ");
					String name = sc.next();
					System.out.println("Enter Employee Department: ");
					String department = sc.next();
					System.out.println("Enter Employee Designation: ");
					String designation = sc.next();
					System.out.println("Enter Employee Salary: ");
					String salary = sc.next();
					System.out.println("Enter Employee Contact No.: ");
					double contact_no = sc.nextDouble();
					System.out.println("Enter Employee Address: ");
					String address = sc.next();
					Employees emp = new Employees(id, name, department, designation,salary,contact_no,address);
					manage.addRecord(emp);
					System.out.println("**Record added Successfully..**");
					System.out.println("================================ \n \n");
					break;
				case 2:
					File file = new File("D:\\SDET Certification\\Automation_trainning\\Practice\\src\\EmployeeData.txt");
					PrintStream stream = new PrintStream(file);
					PrintStream console = System.out;
					System.out.println("**Record Added Successfully To Your File.**");
					System.out.println("============================================= \n \n");
					System.setOut(stream);
					manage.printAllEmpData();
	                System.setOut(console);
					break;
				case 3:
					System.out.println("Enter Id to delete from Record :");
					id = sc.nextInt();
					manage.delete(id);
					System.out.println("** Record has been deleted **");
					System.out.println("=============================== \n \n");
					break;
				case 4:
					System.out.println("Enter Employee Id to Search :");
					id = sc.nextInt();
					manage.search(id);
					System.out.println("================================ \n");
					break;
				case 5:
					System.out.println("Enter Employee Id to Modify :");
					id = sc.nextInt();
					manage.modify(id);
					System.out.println("** Record Modified Successfully **");
					System.out.println("=================================== \n");
					break;
				case 6:
					manage.readFile();
					System.out.println("** File Read Success **");
					System.out.println("========================= \n");
					break;
				case 7:
					manage.printAllEmpData();
					System.out.println("========================================================================================================== \n");
					break;
				case 8:
					System.out.println("** This program has ended as per your choice. **");
					System.out.println("================================================ \n");
					break;
				default:
					System.out.println("** Wrong Selection... **");
					System.out.println("================================ \n");
					break;
				}
			} while (selection != 8);
			sc.close();
		}

	}
	

