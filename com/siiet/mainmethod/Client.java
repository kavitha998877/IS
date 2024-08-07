package com.siiet.mainmethod;

import com.siiet.Application.GSNormalAcc;
import com.siiet.Application.GSShopfactory;
import com.siiet.Application.GsPrimeAcc;

public class Client {
	public static void main(String[] args) {
		GSShopfactory obj=new GSShopfactory();
		//prime account creation
		GsPrimeAcc ga=(GsPrimeAcc)obj.getNewPrimeAcc(12, "java", 600.6f, true);
		ga.bookproduct(ga.getCharges());
		//normal account creation
		GSNormalAcc ge=(GSNormalAcc)obj.getNewNormalAcc(13, "spring", 600.6f,65.4f);
		ge.bookproduct(ge.getCharges());
	}

}
