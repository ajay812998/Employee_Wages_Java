package com.bridgelabz;

public class Employee{
	
	public static void main(String[] args) {
			int present=1;
			int checkout=(int) (Math.floor(Math.random() *10) %2);
			System.out.println(checkout);
			if (checkout == present) {
				System.out.println("Employee Present");
			}
			else
				System.out.println("Employee Absent");
			
			
			
	}
}