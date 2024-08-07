package com.siiet.BankApplication;

import com.siiet.Application.GsPrimeAcc;
import com.siiet.BankFramework.BankFactory;
import com.siiet.BankFramework.CurrentAcc;
import com.siiet.BankFramework.SavingAcc;
import com.siiet.Framewoek.PrimeAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int Accno, String AccNm, float accBal, boolean isSalaried) {
		SavingAcc savingaac=new MMSavingAcc(Accno,AccNm,accBal,isSalaried);
		return savingaac;

		// TODO Auto-generated method stub

	}

	@Override
	public CurrentAcc getNewCurrentAcc(int Accno, String AccNm, float accBal, float creditLimit) {
		CurrentAcc currentacc=new MMCurrentAcc(Accno,AccNm,accBal,creditLimit);
		return currentacc;
		// TODO Auto-generated method stub
			}

}
