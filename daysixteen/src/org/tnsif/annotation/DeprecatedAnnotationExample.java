package org.tnsif.annotation;

public class DeprecatedAnnotationExample {
	
	@Deprecated
	public void print()
	{
		System.out.println("Welcome to Java Annotations");
	}
	
	public static void main(String[] args)
	{
		DeprecatedAnnotationExample d = new DeprecatedAnnotationExample();
		d.print();
	}

}
