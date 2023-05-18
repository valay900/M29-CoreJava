package org.tnsif.constructoroverloading;

public class CustomerOverloadingExecutor {

	public static void main(String[] args) {
		
		CustomerOverloadingExample c1 = new CustomerOverloadingExample();
		CustomerOverloadingExample c2 = new CustomerOverloadingExample(12);
		CustomerOverloadingExample c3 = new CustomerOverloadingExample(12, 13);
		
	}

}