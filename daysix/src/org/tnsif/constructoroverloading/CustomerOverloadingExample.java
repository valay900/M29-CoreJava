package org.tnsif.constructoroverloading;

public class CustomerOverloadingExample {
	
	private int x;
	private int y;
	
	public CustomerOverloadingExample()
	{
		System.out.println("Default constructor");
	}
	
	public CustomerOverloadingExample(int x)
	{
		System.out.println("Parameterized constructor " + x);
	}
	
	public CustomerOverloadingExample(int x , int y)
	{
		System.out.println("Parameterized constructor " + x + " " + y);
	}

}