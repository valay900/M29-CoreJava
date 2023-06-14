//program to demonstrate on nested try catch block
package org.tnsif.exceptiondemo;

import java.util.*;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x = s.nextInt();
		int y = s.nextInt();
		int arr[] = new int[] {11,22,33};
		
		try
		{
			try
			{
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception handled " + e);
			}
			try 
			{
				System.out.println(x/y);
			}
			catch (ArithmeticException e)
			{
				System.out.println("Exception handled " + e);
			}
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}

}
