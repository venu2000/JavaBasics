package com.flm.accessmodifiers;


import com.flm.accessmodifier.Viewer;

public class MainClass {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("Venu", 1526,"ECE", "2828282828");
	        Student s2 = new Student("Ravi", 1527, "CSE", "1234567890");
	        Student s3 = new Student("Anita", 1528, "CSE", "0987654321");
	
	 
		
		Department cseDept = new Department("CSE", new Professor("Sharma", "PR1526"));
		cseDept.addStudents(s1);
		cseDept.addStudents(s2);
		cseDept.addStudents(s3);
		cseDept.debugPrintStudents();
	  
//		Professor p1 = cseDept.getProfessor();
//		System.out.println(p1);
//		p1.showAllStudents(cseDept);
//		
//		//to print only name of the professor
//		System.out.println(cseDept.getProfessor().getName());
		
		
		
  
		
	
		
		
		
		
		
		

	}

}
