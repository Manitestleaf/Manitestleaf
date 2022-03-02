package week1day3;

import java.util.Scanner;

public class EmployeeDetails {
	public void employeeName()
	{
		String Name="manikandan";
		int Id=110798;
		System.out.println("Employee Name:"+Name);
		System.out.println("Employee ID:"+Id);
	}
	
	public void employeeAddress(String address)
	{
		System.out.println("Employee Address:"+address);
	}
	
	public void employeeSalary()
	{
		double Salary=55000.00;
		System.out.println("Employee Salary:"+Salary);
	}
	
	public void mobileNumber()
	{
		long Number=917690409;
		System.out.println("Employee Ph.No:"+Number);
	}
	
	
	public static void main(String[] args) {
		
		EmployeeDetails details=new EmployeeDetails();
		
		details.employeeName();
		details.mobileNumber();
		details.employeeSalary();
		
		Scanner add=new Scanner(System.in);
		
		System.out.println("Enter the address:");
		
		String area=add.nextLine();
		details.employeeAddress(area);
	}

}
