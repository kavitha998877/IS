package com.siiet.Streamapi2;

import java.util.stream.Stream;

public class Limit {
	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9,10)
		.limit(9)
		.forEach(num->System.out.println(num+" "));


}
}