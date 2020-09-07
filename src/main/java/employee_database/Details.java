package employee_database;

import java.util.ArrayList;
import java.util.Scanner;

public class Details {


		public static ArrayList<String> name=new ArrayList<String>();
		public static ArrayList<String> department=new ArrayList<String>();
		public static ArrayList<Integer> employeeId=new ArrayList<Integer>();
		public static ArrayList<String> address=new ArrayList<String>();
		public  Details(String name,int empId,String address,String department )
		{
			this.name.add(name);
			this.department.add(department);
			this.address.add(address);
			this.employeeId.add(empId);
			
		}
		
		public Details() {
			
		}
		public void createEmployeeDetails()
		{
			Scanner keyboardInput=new Scanner(System.in);
			boolean entry=true;
			
			while(entry)
			{
				System.out.println("enter the name");
				this.name.add(keyboardInput.nextLine());
				System.out.println("enter the department");
				this.department.add(keyboardInput.nextLine());
				System.out.println("enter the address");
				this.address.add(keyboardInput.nextLine());
				System.out.println("enter the employeeId");
				this.employeeId.add(keyboardInput.nextInt());
				CreateSearch csObject=new CreateSearch();
				csObject.menuDriven();
			}
			
			
		}

		

		public void searchByName(String employeeName) {
		
			for(int index=0;index<name.size();index++)
			{
				String s=name.get(index);
				if(s.equals(employeeName))
				{
					System.out.println("employeeId:"+employeeId.get(index));
					System.out.println("name:"+name.get(index));
					System.out.println("department:"+department.get(index));
					System.out.println("address:"+address.get(index));
					System.out.println();
				}
				
			}
			CreateSearch csObject=new CreateSearch();
			csObject.menuDriven();	
		}

		public static void main(String[] args) {

			CreateSearch cs = new CreateSearch();
			cs.menuDriven();
		}
		public void searchByDepartment(String employeeDepartment) {
			for(int index=0;index<department.size();index++)
			{
				String s=department.get(index);
				if(s.equals(employeeDepartment))
				{
					System.out.println("name:"+name.get(index));
					System.out.println("employeeId:"+employeeId.get(index));
					System.out.println("department:"+department.get(index));
					System.out.println("address:"+address.get(index));
					System.out.println();
					
				}	
			}
			CreateSearch csObject=new CreateSearch();
			csObject.menuDriven();	
		
			
		}
		public void searchById(int id) {
			
			for(int index=0;index<employeeId.size();index++)
			{
				int empId=employeeId.get(index);
				if(empId==id)
				{
					
					System.out.println("name:"+name.get(index));
					System.out.println("employeeId:"+employeeId.get(index));
					System.out.println("department:"+department.get(index));
					System.out.println("address:"+address.get(index));
					System.out.println();
				
				}
				
			}
			
			
			CreateSearch csObject=new CreateSearch();
			csObject.menuDriven();	
			
		}

		public void deleteEmployee(int userId) {
			int count=0;
			for(int index=0;index<employeeId.size();index++)
			{
				int empId=employeeId.get(index);
				if(userId==empId)
				{
					System.out.println("name:"+name.get(index));
					System.out.println("employeeId:"+employeeId.get(index));
					System.out.println("department:"+department.get(index));
					System.out.println("address:"+address.get(index));
					System.out.println();
					count++;
				}	
				
			}
			if(count==1)
			{
				System.out.println("This details are deleted");
			}
			else
				System.out.println("This details are already deleted");
			
			CreateSearch csObject=new CreateSearch();
			csObject.menuDriven();	

		}
		
			


}
