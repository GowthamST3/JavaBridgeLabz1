package com.BridgeLabz;

public class EmpWageBuilderUC3 {

	public static void main(String[] args)
	  {
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HR = 20;

		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() *10) %2;
		if(empCheck == IS_FULL_TIME)
			empHrs=8;		

		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Employee Wage = "+empWage);
	  }

}
