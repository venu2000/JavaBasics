package com.flm.encapsulation;

public class MainMethod {

	public static void main(String[] args) {
	
		
	  Employee emp = new Employee("Venu","152620");
	
	  emp.setSalary(100000);	  
	  emp.totalSalary();
	  emp.displayEmployeeDetails();
//	  
	  System.out.println();
	  
	  Manager m1 = new Manager("Gopal","282021");
	  m1.setIncentives(15000);
      m1.setSalary(200000);
      m1.totalSalary();
      
      m1.displayEmployeeDetails();
	  m1.managerTotalSalary();
//	

	}

}
