package com.BridgeLabz;

public class EmpWageBuilderUC2 {

	public static void main(String[] args)
	  {
		
        int empPresent = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.print(empCheck);		  
        if (empCheck == empPresent)
        {
		     System.out.println("Emp is Present ");
        }
        else
        {
      	  System.out.println("Emp is not Present ");  
        }
	  }

}
