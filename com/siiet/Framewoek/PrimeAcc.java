package com.siiet.Framewoek;

public class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private static final float deliverycharge=0;
		public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	public static float getDeliverycharge() {
		return deliverycharge;
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	public PrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
		super(accno, accnm, charges);
		this.isPrime = isPrime;
	}
	public void bookproduct(float charges) {
		
	}
	
				

}
