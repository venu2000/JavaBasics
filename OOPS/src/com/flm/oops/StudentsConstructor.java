package com.flm.oops;

public class StudentsConstructor {

    String studentName;
    int age;
    int rollNo;
    String gender;

    StudentsConstructor(String studentName, 
    		               int age, 
    		               int rollNo, 
    		               String gender) {
    	
        this.studentName = studentName;
        this.age = age;
        this.rollNo = rollNo;
        this.gender = gender;
    }

    public static void main(String[] args) {

        StudentsConstructor s1 = new StudentsConstructor("Venu", 20, 101, "Male");
        StudentsConstructor s2 = new StudentsConstructor("Ravi", 21, 102, "Male");
        StudentsConstructor s3 = new StudentsConstructor("Sita", 19, 103, "Female");

        System.out.println(s1.studentName + " " + s1.age + " " + s1.rollNo + " " + s1.gender);
        System.out.println(s2.studentName + " " + s2.age + " " + s2.rollNo + " " + s2.gender);
        System.out.println(s3.studentName + " " + s3.age + " " + s3.rollNo + " " + s3.gender);
    }
}
