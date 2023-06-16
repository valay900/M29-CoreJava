package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean issalaried;
	static final private float minbal=0.0f;
	
	public SavingAcc(int accno, String accnm, float accbal,boolean issalaried) {
		super(accno, accnm, accbal);
		this.issalaried=issalaried;
	}
	
	public void withdraw(float accbal)
	{
		System.out.println(" account no "+this.getAccno());
		
	}

	@Override
	public String toString() {
		return "SavingAcc [issalaried=" + issalaried + "]";
	}
	

}
