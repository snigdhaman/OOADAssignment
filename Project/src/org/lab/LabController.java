package org.lab;

public class LabController 
{
	public static void main (String args[])
	{
		Employee emp1 = EmployeeFactory.getInstance().createEmployeeInFactory("Lab Technician");
		Employee emp2 = EmployeeFactory.getInstance().createEmployeeInFactory("Lab Technician");
		Employee emp3 = EmployeeFactory.getInstance().createEmployeeInFactory("Admin");
		System.out.println(emp1.getDesignation());
		System.out.println(emp2.getDesignation());
		System.out.println(emp3.getDesignation());
	}
	
}
