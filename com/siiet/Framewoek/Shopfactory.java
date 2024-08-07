package com.siiet.Framewoek;

public interface Shopfactory {
public PrimeAcc getNewPrimeAcc(int Accno,String AccNm,float charges,boolean isprime);
public NormalAcc getNewNormalAcc(int Accno,String AccNm,float charges,float deliverycharges);

}
