package com.javabasics;

public class Account {
	int accountNumber;
	String accountHolderName;
	double accountBalance;
	
	void initAccotInfo() {
		accountNumber=101;
		accountHolderName="shweta";
		accountBalance=210000;
	}
	
	void printInfo() {
		System.out.println("accountNumber:"+accountNumber);
		System.out.println("accountHolderName:"+accountHolderName);
		System.out.println(" accountBalance:"+ accountBalance);
	}
	public static void main(String[] args) {
		Account a;
		a=new Account();
		a.initAccotInfo();
		a.printInfo();
	
	}

}
