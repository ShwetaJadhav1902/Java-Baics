package com.javabasics;

public class employee {
		int employeeId;
		String employeeName;
		double employeeSalary;
		
		void initEmpInfo() {
			employeeId=101;
		    employeeName="shweta";
		    employeeSalary=60000;
		}
		
		void printInfo() {
			System.out.println(" employee Id:"+ employeeId);
			System.out.println(" employee Name:"+ employeeName);
			System.out.println(" employeeSalary:"+ employeeSalary);
		}
		public static void main(String[] args) {
			employee e;
			e=new employee();
			e.initEmpInfo();
			e.printInfo();
		
		}

	}



