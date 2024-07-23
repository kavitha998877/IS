package com.siiet.Streamapi;

import java.util.ArrayList;
import java.util.List;

public class Max {
	public static void main(String[] args) {
		List<Product> pl=new ArrayList<Product>();
		pl.add(new Product(1,"hp",45000));
		pl.add(new Product(2,"dell",30000));
		pl.add(new Product(3,"honor",75000));
		Product p=pl.stream().max((Product1,Product2)->Product1.price>Product2.price?1:-1).get();
		System.out.println(p.price);
		
	}

}
