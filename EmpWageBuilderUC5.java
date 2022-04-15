package com.BridgeLabz;

public class EmpWageBuilderUC5 {

	public static void main(String[] args)
	{
		 int IS_PART_TIME = 1;
		 int IS_FULL_TIME = 2;
		 int EMP_RATE_PER_HR = 20;
		
		int empHrs = 0;
		int empWage = 0;

		int empCheck =(int) Math.floor(Math.random() *10) %3;
		switch(empCheck)
		{
		case 1:
			empHrs = 4;		
			break;
		case 2:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Employee Wage = "+empWage);
  } 

}
