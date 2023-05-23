//program to demonstrate on Object class
package org.tnsif.objectclassdemo;

class Sample
{
	
}

class Demo
{
	//Constructor
	Demo()
	{
		System.out.println("Inside Constructor");
	}
	protected void finalize()
	{
		System.out.println("In Finalize method");
	}
}

public class ObjectClassDemo {

	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		
		Demo d = new Demo();
		System.out.println(d.getClass());
		System.out.println(s.hashCode());
		
		Object obj = new Object();
		System.out.println(obj.getClass());

	}

}
