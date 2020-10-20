package com.bridgelabz;

public class Employee{
	
	public static void main(String[] args) {
		int Full_Time=1;
		int Part_Time=2;
		int Wages_Per_Hour=20;
		int full_Day_Hour=8;
		int Part_Day_Hour=4;
		int month_days=20;
		int workingDays=0;
		int workingHour=1;
		int Max_days=20;
		int Total=0;
		while (workingDays <= Max_days && workingHour <= 100) {
		int empcheckout=(int) (Math.floor(Math.random() *10) %3 );
		System.out.println("The Result is :"+empcheckout);
		switch(empcheckout){
		    case 0 :System.out.println("Employee is Absent");
		                   break;
			case 1 :int total_wage=Wages_Per_Hour * full_Day_Hour;
								workingHour=workingHour+full_Day_Hour;
								Total=total_wage+Total;
								break;
			case 2 :int total_part_time=Wages_Per_Hour * Part_Day_Hour;
								workingHour=workingHour+Part_Day_Hour;
								Total=total_part_time+Part_Day_Hour;
								break;
			default : System.out.println("Wrong Entry");
			                    break;
		}
	   workingDays++;
	}
     System.out.println("Wages in a Month are :"+Total);
	}
}