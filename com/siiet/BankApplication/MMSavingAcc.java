package com.siiet.BankApplication;

import com.siiet.BankFramework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accno, String accnm, float accBal, boolean isSalaried) {
		super(accno, accnm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal) {
		System.out.println("Dear Saving account user,your accBal is:"+getcreditLimit());
	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccno()="
				+ getAccno() + ", getAccnm()=" + getAccnm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
