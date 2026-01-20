package com.flm.oops;

public class StudentObj {

    String studentName;
    int age;
    int studentId;
    String gender;

    public static void main(String[] args) {

        // First student
        StudentObj s1 = new StudentObj();
        s1.studentName = "Venu";
        s1.age = 25;
        s1.studentId = 1526;
        s1.gender = "M";

        // Second student
        StudentObj s2 = new StudentObj();
        s2.studentName = "Ravi";
        s2.age = 24;
        s2.studentId = 1111;
        s2.gender = "M";

        
        // Third student
        StudentObj s3 = new StudentObj();
        s3.studentName = "Naveena";
        s3.age = 24;
        s3.studentId = 2615;
        s3.gender = "F";

        // Print all students
        System.out.println(s1.studentName + " " + s1.age + " " + s1.studentId + " " + s1.gender);
        System.out.println(s2.studentName + " " + s2.age + " " + s2.studentId + " " + s2.gender);
        System.out.println(s3.studentName + " " + s3.age + " " + s3.studentId + " " + s3.gender);
    }
}
