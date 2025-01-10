package com.javabasics;

public class Student {
	int studentId;
	String studentName;
	double studentAge;
	
	void initStudInfo() {
		studentId=101;
		studentName="shweta";
		studentAge=21;
	}
	
	void printInfo() {
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Age:"+studentAge);
	}
	public static void main(String[] args) {
		Student s;
		s=new Student();
		s.initStudInfo();
		s.printInfo();
	
	}

}
