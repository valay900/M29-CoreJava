package org.tnsif.interfacedemo;

public class ATMMachineChild implements ATMMachine{

	@Override
	public void withdraw() {
		System.out.println("Withdraw amount: " + amountWithdra);
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposited amount: " + amountDeposit);
		
	}

}
