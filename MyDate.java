package com.javabasics;

public class MyDate {
	private int day,month,year;
	
	public MyDate()
	{
		day=30;
		month=6;
		year=2011;
	}
	public void printDate()
	{
		System.out.println("Date is:"+day+"/"+month+"/"+year);
	}
   public static void main(String[] args) {
	MyDate d;
	d=new MyDate();

	d.printDate();
}
}
