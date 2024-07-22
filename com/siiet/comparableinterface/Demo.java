package com.siiet.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s=new Student(103,"Kavitha","cse");
		al.add(s);
	  s=new Student(104,"Laxmi","cse");
		al.add(s);
	  s=new Student(105,"Priya","cse");
		al.add(s);
		System.out.println("before sorting"+al);
		System.out.println("after sorting");
		Collections.sort(al);
		System.out.println(al);

	}
}






