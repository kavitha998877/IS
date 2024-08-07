package com.siiet.array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int arary[]=new int [5];
		for (int i=5;i>0;i--)
			arary[5-i]=i;
		Arrays.fill(arary,1,4,8);
		for(int i=0;i<5;i++)
			System.out.println(arary[i]);
	}

}
