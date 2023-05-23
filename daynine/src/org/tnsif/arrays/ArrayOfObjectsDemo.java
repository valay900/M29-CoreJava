package org.tnsif.arrays;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		
		Customer arr[] = new Customer[2];
		
		arr[0] = new Customer(12345, "Niket");
		arr[1] = new Customer(34589, "Aniket");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i].getId()+ " " + arr[i].getName() );
		}

	}

}
