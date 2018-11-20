package org.lab;

public class EmployeeFactory 
{
	private static EmployeeFactory instance = null;
	
	private EmployeeFactory () 
	{
		
	}
	
	public static synchronized EmployeeFactory getInstance()
	{
		if (instance == null) {
			instance = new EmployeeFactory();
		}
		return instance;
	}
	
	public Employee createEmployeeInFactory (String designation)
	{
		if (designation.equalsIgnoreCase("Lab Technician")) {
			return new LabTechnician("Lab Technician");
		}
		else {
			return new Admin("Admin");
		}
	}
}
