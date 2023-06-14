//Program to demonstrate on Generics advantage
package org.tnsif.generics;
import java.util.*;
public class GenericsAdvantageExample {

	public static void main(String[] args) {
		//1. Type-safety
		List<Integer> list = new ArrayList();
		list.add(11);
		list.add(25);
		//list.add(23.5);
		System.out.println(list);
		
		//2. Before Generics, Typecasting is allowed
		ArrayList arr1 = new ArrayList();
		arr1.add("SJCEM");
		System.out.println(arr1);
		String str = (String)arr1.get(0);
		System.out.println(str);
		
		//3. In Generics, Typecasting is not allowed
		ArrayList<String> arr2 = new ArrayList();
		arr2.add("SJCEM");
		System.out.println(arr2);
		String str1 = (String)arr2.get(0);
		System.out.println(str1);
		

	}
	

}
