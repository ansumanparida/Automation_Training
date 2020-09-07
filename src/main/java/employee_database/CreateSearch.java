package employee_database;

import java.util.Scanner;

public class CreateSearch {
	
	public void menuDriven() {
		System.out.println("**Employee Record Management**");
		System.out.println(": Enter Your Choice :"+"\n"+"Press 1 to create employee"+"\n"+"Press 2 to search employee"+"\n"+"Press 3 to delete employee"+"\n"+"press any other to exit");
		Scanner userInput=new Scanner(System.in);
		int  choice=userInput.nextInt();
		Details d=new Details();

		
		switch(choice)
		{
		case 1:
			{
				d.createEmployeeDetails();
								
			}
			break;
			
		case 2:
			{
				Scanner keyboardInput=new Scanner(System.in);
				System.out.println("enter 1 to search by name");
				System.out.println("enter 2 to search by department");
				System.out.println("enter 3 to search by id");
				int value=keyboardInput.nextInt();
				if(value==1)
				{
					System.out.println("enter the name to be searached by");
					String employeeName=keyboardInput.next();
					d.searchByName(employeeName);
					
				}
				if(value==2)
				{
					System.out.println("enter the department to be searached by");
					String employeeDepartment=keyboardInput.next();
					d.searchByDepartment(employeeDepartment);
					
				}
				if(value==3)
				{
					System.out.println("enter the id to be searached by");
					int id=keyboardInput.nextInt();
					d.searchById(id);
					
				}

				
			}
			break;
			
		case 3:
		{
			Scanner keyboardInput=new Scanner(System.in);
			System.out.println("enter the employee id to delete that employee");
			int userId=keyboardInput.nextInt();
			d.deleteEmployee(userId);
		}
		
		default :
		System.exit(0);
		}

	}

}
