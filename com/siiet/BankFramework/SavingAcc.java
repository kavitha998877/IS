package com.siiet.BankFramework;

public class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final float creditLimit=0;
	public boolean isSalaried() {
		return isSalaried;
	}
	public static float getcreditLimit() {
		return creditLimit;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	public SavingAcc(int accno, String accnm, float accBal, boolean isSalaried) {
		super(accno, accnm, accBal);
		this.isSalaried = isSalaried;
	}
	public void withdraw(float accBal) {
		
	}
	

}
