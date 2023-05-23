package org.tnsif.singleton;

public class Singleton {
	
	private static final Singleton single=new Singleton();
	
	private Singleton()
	{
		
	}
	
	public static Singleton getsingle() {
		return single;
	}
}