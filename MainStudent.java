package com.javabasics;

public class MainStudent{

		public static void main(String[] args) {
			Student1 s=new Student1();
			
			s.setStudentId(101);
			s.setStudentName("shweta");
			s.setStudentAge(21);
			
			int id=s.getStudentId();
			System.out.println("StudentId:"+id);
			String name=s.getStudentName();
			System.out.println("StudentName:"+name);
			int age=s.getStudentAge();
			System.out.println("StudentAge:"+age);
		}


	}



