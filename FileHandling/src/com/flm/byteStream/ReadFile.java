package com.flm.byteStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args)  {
		
		
          createFile();
  		readAFile();
  		writeIntoAFile();
  		readAndWriteFrmFile1ToFile2();
  		
  		
  		
  		// to delete the file 
//      File file2 = new File("C://Users/ASUS/Documents/FileHandling/write2.txt");
//  	file2.delete();
  		
  		
	}


	private static void readAndWriteFrmFile1ToFile2() {
//		File file1 = new File("C://Users/ASUS/Documents/FileHandling/venu.jpg");
//		File file2 = new File("C://Users/ASUS/Documents/FileHandling/venu2.jpg");
		File file1 = new File("C://Users/ASUS/Documents/FileHandling/write1.txt");
  		File file2 = new File("C://Users/ASUS/Documents/FileHandling/write2.txt");
  		FileInputStream fis = null;
  		FileOutputStream fos = null;
  		try {
			 fis =new FileInputStream(file1);
			 fos = new FileOutputStream(file2);
			 int temp;
			 while((temp=fis.read())!=-1) {
				 
				 fos.write(temp);
				 
			 }
			 
			 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	private static void writeIntoAFile() {
		//it will create non exsisting file automatically
		File file = new File("C://Users/ASUS/Documents/FileHandling/write1.txt");
  		
          String temp = "Write file content";
          
          FileOutputStream fos = null;
          try {
        	  fos = new FileOutputStream(file);
			byte[] bytes = temp.getBytes();
			fos.write(bytes);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static void readAFile() {
		File file = new File("C://Users/ASUS/Documents/FileHandling/test1.txt");
          FileInputStream fis= null;
          try {
        	  fis = new FileInputStream(file);
		//	System.out.println(fis.read());   this will print only 1st letter 
        	  
    
        	  int temp; // to hold bytes
              while((temp = fis.read())!= -1) {
            	  
            	  System.out.print((char)temp);	  
        	  }
		
		} catch (IOException e) {
		
			System.out.println(e);
		}
	}
    //method to create a Empty File 
	private static void createFile() {
		File file = new File("C://Users/ASUS/Documents/FileHandling/write2.txt");
		try {
			file.createNewFile();
			System.out.println("FileCreated");
		} catch (IOException e) {
			
			System.out.println(e);
		}
	}

}
