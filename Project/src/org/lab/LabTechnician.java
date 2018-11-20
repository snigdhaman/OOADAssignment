package org.lab;

public class LabTechnician extends Employee
{
	public LabTechnician(String designation) {
		super(designation);
	}

	@Override
	public void setDesignation() {
		this.designation = "Lab Technician";
	}
}
