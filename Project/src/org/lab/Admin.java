package org.lab;

public class Admin extends Employee
{
	public Admin(String designation) {
		super(designation);
	}

	@Override
	public void setDesignation() {
		this.designation = "Admin";
	}
}
