package org.tnsif.application;

import org.tnsif.framework.SavingAcc;

public class mmsavingacc extends SavingAcc {

	public mmsavingacc(int accno, String accnm, float accbal, boolean issalaried) {
		super(accno, accnm, accbal, issalaried);
		
	}

	@Override
	public String toString() {
		return "mmsavingacc [toString()=" + super.toString() + ", getAccno()=" + getAccno() + ", getAccnm()="
				+ getAccnm() + ", getAccbal()=" + getAccbal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	
	
	

}
