package org.lab;

public abstract class Employee 
{
	protected String id;
	protected String name;
	protected String designation;
	protected String address;
	
	public Employee (String designation) {
		this.designation = designation;
	}

	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDesignation() 
	{
		return designation;
	}
	public abstract void setDesignation(); 

	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", address=" + address
				+ "]";
	}
}
