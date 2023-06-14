package org.tnsif.annotation;

class Car
{
	public void speed(int speed)
	{
		System.out.println("speed is : "+ speed +"km/hr");
	}
}


class Lamborghini extends Car
{
	@Override
	public void speed(int speed)
	{
		System.out.println("speed is : "+ speed +"km/hr");
	}
}


public class OverrideAnnotationExample {

	public static void main(String[] args) {
		Lamborghini l=new Lamborghini();
		l.speed(90);

	}

}