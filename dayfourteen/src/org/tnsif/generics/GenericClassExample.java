//Program to demonstrate Generics class
package org.tnsif.generics;

//generics class
class GenericClass<T> {
	
	T x;
	void print(T x)
	{
		this.x=x;
	}
	T accept()
	{
		return x;
		
	}
}	

public class GenericClassExample
{
	public static void main(String[] args) {
		GenericClass<Character>obj = new GenericClass<>();
		obj.print('N');
		System.out.println(obj.accept());
		

	}

}
