package com.bridgelabz;

public class Employee{
	
	public static void main(String[] args) {
		int Present=1;
		int Wages_Per_Hour=20;
		int Full_Day_Hour=8;
		int empcheckout=(int) (Math.floor(Math.random() *10) %2);
		System.out.println("Result is :"+empcheckout);
		if (empcheckout == Present) {
			int Total_Daily_Wages=Wages_Per_Hour * Full_Day_Hour;
			System.out.println("Daily total Wages are :"+Total_Daily_Wages);
		}
		else
			System.out.println("Employee is Absent");
		
		
		

		}

	}
