package com.flm.encapsulation;

public class Manager extends Employee {
	
  private double incentives;
  
	
      Manager(String name, String ID){
    	  super(name, ID);
    	  setID("MNG", ID);
      }

	   public double getIncentives() {
		return incentives;
	}


	   public void setIncentives(int incentives) {
		this.incentives = incentives;
	}


	   public void managerTotalSalary() {
		   
		System.out.println("manager Total + Incentives : "+(totalSalary()+incentives));  
		   
	   }
	   

}
