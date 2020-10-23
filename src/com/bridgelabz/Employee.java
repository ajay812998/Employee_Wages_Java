package com.bridgelabz;

public class Employee{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfworkingDays;
	private final int maxHoursPerMonth;
	
	public Employee(String company,int empRatePerHour,int numOfworkingDays,int maxHoursPerMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfworkingDays=numOfworkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
		}
	private int function() {
		int empHours=0,totalEmpHours=0,totalWorkingDays=0;
		
		while(totalEmpHours<=maxHoursPerMonth && totalWorkingDays<numOfworkingDays) {
			totalWorkingDays++;
			int check=(int) (Math.floor(Math.random()*10)%3);
			switch(check) {
			 case IS_FULL_TIME : empHours=8;
			 		     break;
			 case IS_PART_TIME : empHours=4;
			 		     break;
			 default : empHours=0;
			}
			totalEmpHours+=empHours;
			System.out.println("Day :"+totalWorkingDays+"Emp Hours :"+empHours);
			
		}
		System.out.println("Total Employee work Hours :"+totalEmpHours);
		return totalEmpHours;
	}
	public static void main(String[] args) {
		Employee first=new Employee("Idea",15,20,125);
		Employee second=new Employee("Airtel",15,10,150);
	    System.out.println("Total Employee Wage for "+first.company+":"+first.function());
	    System.out.println("Total Employee Wage for "+second.company+":"+second.function());
 }
}




