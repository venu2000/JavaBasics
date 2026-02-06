package com.task.Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingtask {

	public static void main(String[] args) {
		
		CreatedAndWriting10Files();
		
		copyingFilesContentIntoNewFiles();

	
	}

	private static void copyingFilesContentIntoNewFiles() {
		String basePath1 = "C:/Users/ASUS/Documents/FileHandling/Task/";
		String basePath2 = "C:/Users/ASUS/Documents/FileHandling/Tasks/";
		for(int i =1; i<=10;i++) {
		
			
		File file1 = new File(basePath1 +"test"+ i+ ".txt");	
		File file2 = new File(basePath2 +"NewFile"+ i+ ".txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			 fis =new FileInputStream(file1);
			 fos = new FileOutputStream(file2);
			
			 int temp;
			 while((temp=fis.read())!= -1) {
				 fos.write((char)temp);
				
				 
			 }
			 System.out.println("Content copied Successfully for NewFile " + i);
			 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		}
	}

	private static void CreatedAndWriting10Files() {
		String basePath = "C:/Users/ASUS/Documents/FileHandling/Task/";
		
		for(int i =1; i<=10;i++) {
			
			File file = new File(basePath +"Test"+ i+ ".txt");
			
				FileOutputStream fos;
				try {
					fos = new FileOutputStream(file);
					String text = "This is text in file " + i;
					fos.write(text.getBytes());
					System.out.println( i +" - Test File Created & Written Content");
					
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	
		}
	}
		}
