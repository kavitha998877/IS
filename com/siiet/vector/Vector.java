package com.siiet.vector;

public class Vector {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		System.out.println("size of vector"+v.size());
		v.add("red");
		v.add("orange");
		v.add("black");
		v.add("blue");
		v.add("red");
		int capacity=v.capacity();
		System.out.println(capacity);
	}

}
