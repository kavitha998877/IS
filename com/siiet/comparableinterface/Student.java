package com.siiet.comparableinterface;

public class Student implements Comparable<Student>{
	
	int rollno;
   String name;
   String branch;
   public Student(int rollno, String name, String branch) {
	   super();
	   this.rollno=rollno;
       this.name=name;
         this.branch=branch;
}
	// TODO Auto-generated constructor stub
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", branch=" + branch + "]";
}
   public int compareTo(Student s) {
	   return this.rollno-s.rollno;
   }
}