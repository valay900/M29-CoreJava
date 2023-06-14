//program to demonstrate on Multiple Catch Block
package org.tnsif.exceptiondemo;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		
		int arr[] = new int[] {101,33,78};
		System.out.println("Array is: ");
		try {
			System.out.println(arr[3]);
		}
		
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled " + e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled " + e);
		}*/

		catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println("Exception Handled " + e);
		}
	}

}
