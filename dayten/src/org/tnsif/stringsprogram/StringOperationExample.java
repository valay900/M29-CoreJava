package org.tnsif.stringsprogram;

public class StringOperationExample {

	public static void main(String[] args) {
		
		String str1 = new String("Niket");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf('k'));
		System.out.println(str1.hashCode());
		System.out.println(str1.concat("Kamble"));
		System.out.println(str1 + "Kamble");

	}

}
