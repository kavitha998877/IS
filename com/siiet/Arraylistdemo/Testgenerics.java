package com.siiet.Arraylistdemo;



	import java.util.ArrayList;
	import java.util.Iterator;

	//demo for generics
	public class Testgenerics {
		public static void main(String[] args) {
			
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("rohini");
		al.add("guhani");
		al.add("ramya");
		
		//al.add(6);
		System.out.println("elements "+al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	}

