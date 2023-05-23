package org.tnsif.interfacedemo;

public class ReceipeImplementable implements Receipe{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String displayName() {
		
		return "Welcome to " + name;
	}

	

}
