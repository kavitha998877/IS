package com.siiet.Application;

import com.siiet.Framewoek.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accno, String accnm, float charges, float deliverycharges) {
		super(accno, accnm, charges, deliverycharges);
		// TODO Auto-generated constructor stub
	}
public void  bookproduct(float charges) {
	System.out.println("dear normal account user,your product charges are:"+getCharges()+"deliverychares"+getDeliverycharges());
	
}

}
