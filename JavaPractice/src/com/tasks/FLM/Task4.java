package com.tasks.FLM;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
//		Task 4 : CTC Calculator
//		● Define a variable as basic salary and assign a value to it.
//		● Now calculate all components of CTC as per below formulas.
//		● PF = 12% of Basic
//		● HRA = 70% of Basic
//		● Allowance = 25% of HRA
//		Final CTC = Basic + PF + HRA + Allowance
//		Print all salary components one after the other and at the end print final salary.
//		Output :
//		Basic Salary : xxxx
//		PF : xxxx
//		HRA : xxxx
//		Allowance : xxxxx
//		CTC : xxxxx
//		Note : In place of xxxx it should print actual value
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		
		long basicSalary = sc.nextLong();
		
		double pf      = basicSalary * 0.12;
		double HRA     = basicSalary * 0.7;
		double allowance = HRA * 0.25;
		
		double CTC = basicSalary + pf + HRA + allowance;
		
		System.out.println("Basic Salary is :" + basicSalary);
		System.out.println("PF :" + pf);
		System.out.println("HRA :" + HRA);
		System.out.println("Allowance :" + allowance);
		System.out.println("CTC :" + CTC);
		
		

	}

}
