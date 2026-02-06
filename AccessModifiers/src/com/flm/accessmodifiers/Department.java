package com.flm.accessmodifiers;

import java.util.Arrays;

public class Department {
	
	private String deptName;

	private Student[] students;
	private int studentCount = 0;
	Professor professor;
	

	public Department(String deptName,Professor professor) {
		
		this.deptName = deptName;
		this.students = new Student[10];
		this.professor = professor;
		
		
	}
	
	
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", students=" + Arrays.toString(students) + ", studentCount="
				+ studentCount + "]";
	}


	void addStudents(Student s) {
		if(studentCount<students.length) {
			students[studentCount++] = s;
			
		}else {
			System.out.println("Department is full");
		}
	}
	
	
	
	public void debugPrintStudents() {
	    for (int i = 0; i < students.length; i++) {
	        System.out.println(students[i] );
	    }
	}

	
	
	void viewAllStudentsByProfessor() {
		System.out.println("Professor" + professor.getName() + professor.getId() + "Viwwing  "  + "All Student list " );
		
		
		for(Student s : getStudents()) {
			if(s!=null) {
				System.out.println(s);
			}}
			
		}
	

	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public Student[] getStudents() {
		return students;
	}


	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	

}
