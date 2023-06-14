package org.tnsif.exceptiondemo;

import java.io.IOException;

public class ThrowKeywordExample {
	
	public static void donate(int age, int weight) throws IOException
	{
		if(age>18 && weight>50)
			System.out.println("Person is eligible to donate the blood");
		else
			throw new IOException("Not Eligible");
	}

	public static void main(String[] args) {
		try 
		{
			ThrowKeywordExample.donate(19, 52);
		} 
		catch (IOException e) 
		{
			System.out.println("Exception Handled");
		}

	}

}
