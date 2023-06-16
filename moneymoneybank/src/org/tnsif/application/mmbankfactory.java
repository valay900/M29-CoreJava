package org.tnsif.application;
import org.tnsif.framework.SavingAcc;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.BankFactory;


public class mmbankfactory extends BankFactory {
	

	@Override
	public SavingAcc getnewsavingacc(int accno, String accnm, float accbal, boolean issalaried) {
		mmsavingacc m=new mmsavingacc(accno,accnm,accbal,issalaried);
		return m;
		
	}

	@Override
	public CurrentAcc getnewcurrentacc(int accno, String accnm, float accbal, float creditlimit) {
		mmcurrentacc n=new mmcurrentacc(accno,accnm,accbal,creditlimit);
		return n;
		
	}

	

}
