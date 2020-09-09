package com.Employee_Recorder;

import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Record_Manage {
	

		List<Employees> employee = new ArrayList<Employees>();
		Scanner sc = new Scanner(System.in);

		public void addRecord(Employees em) {

			employee.add(em);
		}

		public void printAllEmpData() {

			employee.forEach(em -> System.out.println(em));

		}

		public boolean delete(int id) {
			for (Employees emp : employee) {
				if (emp.getId() == id) {
					employee.remove(employee.indexOf(emp));
					return true;
				}
			}
			return false;
		}

		public void modify(int id) {
			int choice;
			for (Employees emp : employee) {
				if (emp.getId() == id) {

					do {

						System.out.println(
								"Enter The Field To Modify In Record :\n 1. Id\n 2. Name\n 3. Department\n 4. Designation\n 5. Salary\n 6. Stop Editing");
						choice = sc.nextInt();
						switch (choice) {
						case 1:
							System.out.println("Enter Employee Id : ");
							emp.setId(sc.nextInt());
							break;
						case 2:
							System.out.println("Enter Employee Name :");
							emp.setName(sc.next());
							break;
						case 3:
							System.out.println("Enter Employee Department :");
							emp.setDepartment(sc.next());
							break;
						case 4:
							System.out.println("Enter Employee Designation :");
							emp.setDesignation(sc.next());
							break;
						case 5:
							System.out.println("Enter Employee Salary :");
							emp.setSalary(sc.next());
							break;
						case 6:
							System.out.println("*Congratulations Editing Completed..*");
							break;
						default:
							System.out.println("Wrong Input, Please Restart ..!!");
							break;
						}
					} while (choice != 6);

				}
			}

		}


		public void readFile() throws IOException {
			FileReader reader = new FileReader("D:\\SDET Certification\\Automation_trainning\\Practice\\src\\EmployeeData.txt");
			int i;
			while ((i = reader.read()) != -1) {
				System.out.print((char) i);
			}
			System.out.println("\n");
			reader.close();
		}

		public void search(int id) {
			for (Employees emp : employee) {
				if (emp.getId() == id) {

					System.out.println(employee.get(employee.indexOf(emp)));

				}
				else
				{
					System.out.println("** Record Not Found Please Restart your Search **");
					System.out.println("================================================= \n");
				}

			}

		}

	}


