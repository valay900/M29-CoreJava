package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		
		ATMMachine a1 = new ATMMachineChild();
		a1.deposit();
		a1.withdraw();
		
		ReceipeImplementable r = new ReceipeImplementable();
		r.setName("Niket");
		System.out.println(r.displayName());
		
		NestedInterfaceExample n = new NestedInterfaceExample();
		n.setStr1("Niket");
		n.setStr2("Kamble");
		System.out.println(n.concatenate());

	}

}
