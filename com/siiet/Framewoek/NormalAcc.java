package com.siiet.Framewoek;

public class  NormalAcc extends ShopAcc {
	
	private float deliverycharges;
	public void bookproduct(float charges) {
		
	}



	public NormalAcc(int accno, String accnm, float charges, float deliverycharges) {
		super(accno, accnm, charges);
		this.deliverycharges=deliverycharges;
	}



	@Override
	public String toString() {
		return "NormalAcc [deliverycharges=" + deliverycharges + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}



	public float getDeliverycharges() {
		return deliverycharges;
	}



	public void setDeliverycharges(float deliverycharges) {
		this.deliverycharges = deliverycharges;
	}


		

}
