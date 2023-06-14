//program to demonstrate on Arithmetic Exception
package org.tnsif.exceptiondemo;

import java.util.*;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the value of X and Y");
			int x = s.nextInt();
			int y = s.nextInt();
			try {
				System.out.println(x/y);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("Finally block is always executed");
			}
		}

	}

}
