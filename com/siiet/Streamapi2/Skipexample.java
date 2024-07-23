package com.siiet.Streamapi2;

import java.util.stream.Stream;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Skipexample {
	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9,10)
		.filter(num->num%2==0)
		.skip(2)
		.forEach(num->System.out.println(num+" "));
	}

}
