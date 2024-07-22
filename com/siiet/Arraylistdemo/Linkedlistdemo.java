package com.siiet.Arraylistdemo;


	import java.util.LinkedList;

	public class Linkedlistdemo {
		public static void main(String[] args) {
			LinkedList l=new LinkedList();
			l.add("ra");
			l.add(2);
			l.add("hjgs");
			l.add(8.9);
			System.out.println("After invoking add() "+l);
			
			l.add(1, "apple");
			
			l.addFirst("d");
			l.addLast("rashmi");
			
			//l.remove(0);
			
			System.out.println(l);

		}

}
