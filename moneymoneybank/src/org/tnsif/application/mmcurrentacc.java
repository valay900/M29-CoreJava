package org.tnsif.application;

import org.tnsif.framework.CurrentAcc;

public class mmcurrentacc extends CurrentAcc {

	public mmcurrentacc(int accno, String accnm, float accbal, float creditlimit) {
		super(accno, accnm, accbal, creditlimit);
		
	}
	
	

	@Override
	public String toString() {
		return "mmcurrentacc [toString()=" + super.toString() + ", getAccno()=" + getAccno() + ", getAccnm()="
				+ getAccnm() + ", getAccbal()=" + getAccbal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
