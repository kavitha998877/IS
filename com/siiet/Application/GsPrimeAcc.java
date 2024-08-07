package com.siiet.Application;

import com.siiet.Framewoek.PrimeAcc;

public class GsPrimeAcc extends PrimeAcc {

 GsPrimeAcc(int accno, String accnm, float charges,boolean isprime) {
		super(accno, accnm, charges,isprime);
		// TODO Auto-generated constructor stub
		
	}
public void bookproduct(float charges)	{
	System.out.println("Dear prime user ,your product charges are:"+getCharges());
	
}
@Override
public String toString() {
	return "GsPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccno()=" + getAccno()
			+ ", getAccnm()=" + getAccnm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}


}
