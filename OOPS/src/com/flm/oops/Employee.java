package com.flm.oops;

import java.util.Scanner;

public class Employee {
	
	
    String name;
    int Id;
    int age;
    
    static String companyName = "DXC Technologies";
    
     Employee(String name, int Id, int age) {
    	 this.name = name;
    	 this.Id = Id;
    	 this.age = age;
    	 
		
	}
    
    
    
    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department");
        String department = sc.nextLine();
        
        System.out.println("Name -> " + name + "\n" +
                 "id ->" +  Id + "\n" +
        		 "Age -> " + age + "\n" +
        		 "department -> " + department +"\n" +
        		 "Company ->" + companyName ) ;
        
        System.out.println();
    }
    
	}

 
  

