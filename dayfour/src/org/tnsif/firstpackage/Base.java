package org.tnsif.firstpackage;

public class Base {
	
	//declaring access specifier
	int varDefault = 10;
	public String varPublic = "Niket";
	private int varPrivate = 1221;
	protected float varProtected = 25630.59f;
	
	//declaring all access specifier with method
	
	void methodDefault()
	{
		System.out.println("Default access method " + varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public access method " + varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private access method " + varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected access method " + varProtected);
	}

}