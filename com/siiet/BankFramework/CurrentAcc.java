package com.siiet.BankFramework;

public class CurrentAcc extends BankAcc {
	private float creditLimit;
	public void withdraw(float accBal) {
		
	}
	public CurrentAcc(int accno, String accnm, float accBal, float creditLimit) {
		super(accno, accnm, accBal);
		this.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccno()=" + getAccno() + ", getAccnm()=" + getAccnm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
	

}
