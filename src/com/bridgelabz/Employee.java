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
		switch(empcheckout){
		    case 0 : System.out.println("Employee is Absent");
                        break;
			case 1 :int total_Wages=Wages_Per_Hour * full_Day_Hour;
						System.out.println("Wages for Full Time is :"+total_Wages);
						break;
			case 2 :int total_part_time=Wages_Per_Hour * Part_Day_Hour;
						System.out.println("Wages for Part Time Is :"+total_part_time);
						break;
			default : System.out.println("Wrong Entry");
		                break;
		}
		
    }
}
