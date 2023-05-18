//program to demonstrate on static block and method
package org.tnsif.statickeyworddemo;

public class Customer {
	
	private String name;
	private int custId;
	private static String companyName;
	
	//static Block
	static 
	{
		//we cannot use non static variable inside the static block
		//name = "Niket";
		companyName = "Myntra";
	}

	public Customer() 
	{
		System.out.println("Default constructor");
		custId++;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + "]";
	}
	
	static void display()
	{
		System.out.println("Company Name: " + companyName);
	}

}