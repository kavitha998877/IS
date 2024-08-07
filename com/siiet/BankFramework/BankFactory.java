package com.siiet.BankFramework;

public interface BankFactory {
	public  SavingAcc getNewSavingAcc(int Accno,String AccNm,float accBal,boolean isSalaried);
	public   CurrentAcc getNewCurrentAcc(int Accno,String AccNm,float accBal,float creditLimit);

}
