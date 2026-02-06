package com.flm.CharacterStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readFile {

	public static void main(String[] args) throws IOException {
		
		//readingAFile();
		File file = new File("C:/Users/ASUS/Documents/FileHandling/CharacterStream/charText2.txt") ;
		FileWriter fw = new FileWriter(file);
		fw.write("Java developer knows Spring Boot...");
		fw.close();
		
	}

	private static void readingAFile() {
		FileReader fr = null;
		
			try {
				fr= new FileReader("C:/Users/ASUS/Documents/FileHandling/CharacterStream/charText.txt");
				
				int temp;
				while((temp = fr.read())!= -1) {
					
					System.out.print((char)temp);
				}
				
			} catch (IOException e) {
				
				System.out.println("FileNotFound");
			}
		
	}

}
