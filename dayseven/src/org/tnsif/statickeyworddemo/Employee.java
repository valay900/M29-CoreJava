//program to demonstrate on static variable
package org.tnsif.statickeyworddemo;

public class Employee {
	
	private int empID;
	private String empName;
	
	static String companyName="TNSIF";

	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}
	
	

}