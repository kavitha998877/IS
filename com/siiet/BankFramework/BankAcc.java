package com.siiet.BankFramework;

public abstract class BankAcc {
	private int accno;
	private String accnm;
	private float accBal;
	public BankAcc(int accno, String accnm, float accBal) {
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.accBal = accBal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccnm() {
		return accnm;
	}
	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
     abstract public void withdraw(float accBal);
	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accnm=" + accnm + ", accBal=" + accBal + ", getAccno()=" + getAccno()
				+ ", getAccnm()=" + getAccnm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
	
