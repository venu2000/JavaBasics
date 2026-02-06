package com.flm.accessmodifiers;

public class Professor {
	
	private String name;
	private String id;
	
	
	


	@Override
	public String toString() {
		return "Professor [name=" + name + ", id=" + id + "]";
	}

	public Professor(String name, String id) {
		
		this.name = name;
		this.id = id;
		
	}
	
	void showAllStudents(Department dept) {
		dept.viewAllStudentsByProfessor();
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}
	
	
	
	}
	
	
	