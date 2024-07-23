package com.siiet.Streamapi;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Javastringdemo {
public static void main(String[] args) {
	List<Product> pl=new ArrayList<Product>();
	pl.add(new Product(1,"hp",45000));
	pl.add(new Product(2,"dell",30000));
	pl.add(new Product(3,"honor",75000));
	double totalprice=pl.stream().collect(Collectors.summingDouble(Product->Product.price));
			System.out.println(totalprice);
}


}
