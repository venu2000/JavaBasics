package com.flm.exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throwsOnly {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		File file = new File("C:/Users/ASUS/Documents/test2.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (Exception e) {
			System.out.println("FileNotFound");
		}finally {
			System.out.println("Exit");
		}
		
		
		

	}

}
