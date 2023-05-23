package org.tnsif.abstractkeyworddemo;

public abstract class Remote {
	
	public String cellName;
	
	//abstract method
	abstract void functionRemote();
	abstract void create();
	
	//concrete method
	void display()
	{
		System.out.println("Cell name is: " + cellName);
	}

}

class RemoteChild extends Remote
{
	void functionRemote() {
		System.out.println("Abstract method is implemented");
	}
	
	void create () {
		System.out.println("Abstract method - 2");
	}
	
}
