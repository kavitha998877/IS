package com.siiet.practiceprogram;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		System.out.println("enter your string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		System.out.println("Reversed String is");
		System.out.println(sb.reverse().toString());
	
	}
	}
