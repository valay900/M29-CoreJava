//demonstrate a string program by using string literal and keyword
package org.tnsif.stringsprogram;

public class StringSimpleProgram {

	public static void main(String[] args) {
		
		//using string literal
		String str1 = "Niket";
		System.out.println("Using string literal : " + str1);
		
		//using new keyword
		String str2 = new String("Niket");
		System.out.println("Using new keyword : " + str2);
		
		String str3 = "Niket";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		

	}

}
