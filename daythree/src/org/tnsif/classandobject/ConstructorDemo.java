//program to demonstrate on class, Object and Constructor
package org.tnsif.classandobject;

import java.util.*;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int id;
		String city, name;
		
		System.out.println("Enter the Customer ID: ");
		id = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter the Customer Name: ");
		name = s.nextLine();
		
		System.out.println("Enter the Customer City: ");
		city = s.nextLine();
		
		//object creation
		
		Customer c = new Customer();
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setCity(city);
		System.out.println(c);
		
		System.out.println("Enter the Customer ID: ");
		id = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter the Customer Name: ");
		name = s.nextLine();
		
		System.out.println("Enter the Customer City: ");
		city = s.nextLine();
		
		Customer c1 = new Customer(id, name, city);
		System.out.println(c1);
		
	}

}