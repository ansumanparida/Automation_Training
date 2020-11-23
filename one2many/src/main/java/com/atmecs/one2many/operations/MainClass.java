package com.atmecs.one2many.operations;

import java.util.Scanner;

public class MainClass {
	static int choice;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println("Enter the operation you want to perform");
			System.out.println("1.Write Data \n2.Read Data \n3.Modify Data\n4.Delete Data\n5.Exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				AddData add = new AddData();
				add.adddata();
				break;
			case 2:
				ReadData read = new ReadData();
				read.readData();
				break;
			case 3:
				ModifyData modify = new ModifyData();
				modify.updateData();
				break;
				
			case 4:
				DeleteData delete = new DeleteData();
				delete.deleteData();
				break;
			case 5:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Wrong Choice..!!");
				break;
			}
		} while (choice != 6);
	}

}
