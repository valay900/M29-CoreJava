package org.tnsif.framework;

public abstract class BankAcc {
	//private data member
	private int accno;
	private String accnm ;
	private float accbal;
	
	
	public int getAccno() {
		return accno;
	}



	public void setAccno(int accno) {
		this.accno = accno;
	}



	public String getAccnm() {
		return accnm;
	}



	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}



	public float getAccbal() {
		return accbal;
	}



	public void setAccbal(float accbal) {
		this.accbal = accbal;
	}



	//paramatries constructor 
	public BankAcc(int accno, String accnm, float accbal) {
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.accbal = accbal;
	}
	
	
	
    abstract public void withdraw(float accbal);
	
	public void deposite(float accbal)
	{
		System.out.println("ammount is "+accbal);
	}

	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accnm=" + accnm + ", accbal=" + accbal + "]";
	}
	


}
