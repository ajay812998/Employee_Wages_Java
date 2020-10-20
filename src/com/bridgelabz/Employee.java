package com.bridgelabz;

public class Employee{
	
	public static void main(String[] args) {
		int Full_Time=1;
		int Part_Time=2;
		int Wages_Per_Hour=20;
		int full_Day_Hour=8;
		int Part_Day_Hour=4;
		int empcheckout=(int) (Math.floor(Math.random() *10) %3);
		System.out.println("The Result is :"+empcheckout);
		if (empcheckout == Full_Time) {
			int Total_Wages=Wages_Per_Hour * full_Day_Hour;
			System.out.println("Total Wages for Full Time is :"+Total_Wages);
		}
		else if (Part_Time == empcheckout) {
			int total_Wages=Part_Day_Hour * Wages_Per_Hour;
			System.out.println("Total Wages for Part Time Is :"+total_Wages);
		}
		else {
			  System.out.println("Employee is Absent");
		}
	}

}

