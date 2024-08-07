package com.siiet.Application;

import com.siiet.Framewoek.NormalAcc;
import com.siiet.Framewoek.PrimeAcc;
import com.siiet.Framewoek.Shopfactory;

public class GSShopfactory implements Shopfactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int Accno, String AccNm, float charges, boolean isprime) {
		// TODO Auto-generated method stub
		PrimeAcc primeacc=new GsPrimeAcc(Accno,AccNm,charges,isprime);
		return primeacc;
	}

	@Override
	public NormalAcc getNewNormalAcc(int Accno, String AccNm, float charges, float deliverycharges) {
		// TODO Auto-generated method stub
		NormalAcc normalacc=new GSNormalAcc(Accno,AccNm,charges,deliverycharges);
		return normalacc;
	}
	

}
