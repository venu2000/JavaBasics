package com.flm.encapsulation;

public class Employee {

	private String name;
	private String ID;
	private double salary;

	Employee() {

	}

	Employee(String name, String ID) {
		this.name = name;
		setID("EMP", ID);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {

		return ID;
	}

	public String setID(String prifix, String ID) {

		return this.ID = prifix + ID;
	}

	public double getSalary() {

		if (salary > 0) {
			return salary;
		}
		return 0;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculatebonus() {
		return salary * 0.15;
	}

	public double totalSalary() {
		return getSalary() + calculatebonus();
	}

	public void displayEmployeeDetails() {
		System.out.println("Name           : " + name);
		System.out.println("Employee ID    : " + ID);
		System.out.println("Salary         : " + salary);
		System.out.println("Salary + Bonus : " + totalSalary());
	}

}
