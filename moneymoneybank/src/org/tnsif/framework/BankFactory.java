package org.tnsif.framework;

public abstract class BankFactory {
	
	abstract public SavingAcc getnewsavingacc(int accno,String accnm, float accbal,boolean issalaried);
	
	abstract public CurrentAcc getnewcurrentacc(int accno,String accnm, float accbal,float creditlimit);
}
