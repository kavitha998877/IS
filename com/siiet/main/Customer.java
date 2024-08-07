package com.siiet.main;

import com.siiet.BankApplication.MMBankFactory;
import com.siiet.BankApplication.MMCurrentAcc;
import com.siiet.BankApplication.MMSavingAcc;

public class Customer {
	public static void main(String[] args) {
		MMBankFactory obj=new MMBankFactory();
		//Saving account creation
		MMSavingAcc ms=(MMSavingAcc)obj.getNewSavingAcc(6509, "priya", 5000.0f, true);
		ms.withdraw(ms.getcreditLimit());
		//Current account creation
		MMCurrentAcc mc=(MMCurrentAcc)obj.getNewCurrentAcc(7890, "laxmi", 7000.8f, 101.09f);
		mc.withdraw(mc.getAccBal());
	}

}
