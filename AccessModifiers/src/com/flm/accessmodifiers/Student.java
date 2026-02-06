package com.flm.accessmodifiers;

public class Student {
	
	
	private String name;
	private int roll;
	
	private String dept;
	
	
	private String Aadhar;
	
	
	public Student(){}

//	protected Student(String name, int roll, String dept) {
//		super();
//		this.name = name;
//		this.roll = roll;
//		this.dept = dept;
//	}


	 Student(String name, int roll, String dept, String aadhar) {
		
		this.name = name;
		setRoll(roll);
		this.dept = dept;
		setAadhar(aadhar);
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		if (String.valueOf(roll).length() == 4) {
	        this.roll = roll;
	    } else {
	        System.out.println("Invalid Roll Number: Must be exactly 4 digits");
	    }
	}


	public String getDept() {
		return dept;
	}


	 void setDept(String dept) {
		this.dept = dept;
	}


	 String getAadhar() {
		return Aadhar;
	}


	public void setAadhar(String aadhar) {
		if(aadhar.length()==10) {
			this.Aadhar = aadhar;
		}else {
			System.out.println("not valid");
		}
	}



	 @Override
	 public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", dept=" + dept + ", Aadhar=" + Aadhar + "]";
	 }



	
	
	

	

}
