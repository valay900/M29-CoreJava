//program to demonstrate on Nested Interface
package org.tnsif.interfacedemo;

public interface OuterInterface {
	
	int sum();
	interface InnerInterface{
		String concatenate();
	}

}
