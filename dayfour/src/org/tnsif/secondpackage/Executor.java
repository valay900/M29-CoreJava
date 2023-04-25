package org.tnsif.secondpackage;
//way to import the another package
import org.tnsif.firstpackage.*;
public class Executor {

	public static void main(String[] args) {
		
		Base b1 = new Base();
		
		//b1.methodDefault();
		
		b1.methodPublic();

	}

}