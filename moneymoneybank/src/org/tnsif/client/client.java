package org.tnsif.client;
import org.tnsif.application.mmcurrentacc;
import org.tnsif.application.mmsavingacc;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class client {

	public static  void main(String[] args) {
	//BankFactory b=new mmbankfactory();
	SavingAcc p =new mmsavingacc(980,"Valay Chopade",100,true);
	CurrentAcc n =new mmcurrentacc(980,"Rahul Roy",70,80);
	System.out.println("saving acc");
	p.deposite(p.getAccbal());
	System.out.println("current acc");
	n.withdraw(n.getAccbal());
	//System.out.println(p);
	//System.out.println(n);
	

	}

}
