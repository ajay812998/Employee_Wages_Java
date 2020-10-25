package com.bridgelabz;

public class Employee{

	public final String company;
	public final int empRatePerHour;
	public final int numOfworkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
	
	public Employee(String company,int empRatePerHour,int numOfworkingDays,int maxHoursPerMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfworkingDays=numOfworkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	public void setTotalEmpWage(int totalEmpWage)
	{
		
		this.totalEmpWage =totalEmpWage;
	}
	
	@Override
	public String toString()
	{
			return "Total Emp Wage for Company :" + company +" is :" + totalEmpWage;
	}
}
