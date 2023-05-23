//program to demonstrate on Arrays class
package org.tnsif.arrays;

import java.util.Arrays;

public class ArrayClassDemo {
	
	public static void main(String[] args) {
		
		int array[] = {12,67,54,90,87};
		//using arrays class we print all the array elements
		System.out.println(Arrays.toString(array));
		//sorting the array
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
