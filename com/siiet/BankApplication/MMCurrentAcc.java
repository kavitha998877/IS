package com.siiet.BankApplication;

import com.siiet.BankFramework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accno, String accnm, float accBal, float creditLimit) {
		super(accno, accnm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
public void withdraw(float accBal) {
	System.out.println("Dear Current account user ,your accBal is:"+getAccBal()+"creditlimit"+getCreditLimit());
}
}
