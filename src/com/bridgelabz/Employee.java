package com.bridgelabz;

public class Employee{
	
	public static void main(String[] args) {
		int Full_Time=1;
		int Part_Time=2;
		int Wages_Per_Hour=20;
		int full_Day_Hour=8;
		int Part_Day_Hour=4;
		int month_days=20;
		int empcheckout=(int) (Math.floor(Math.random() *10) %3);
		System.out.println("The Result is :"+empcheckout);
		switch(empcheckout){
		    case 0 :System.out.println("Employee is Absent");
		                   break;
			case 1 :int total=Wages_Per_Hour * full_Day_Hour;
								System.out.println("Wage for Full Time is :"+total * month_days);
								break;
			case 2 :int total_part_time=Wages_Per_Hour * Part_Day_Hour;
								System.out.println("Wage for Part Time is :"+total_part_time * month_days);
								break;
			default : System.out.println("Wrong Entry");
		}
	}
}
