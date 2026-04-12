package com.filehandling;

import java.io.FileOutputStream;
import java.io.*;
public class FileStreams2 {
	
	public static void addDataToFile(String location, String data) throws IOException {
		FileOutputStream fos=new FileOutputStream(location);
		fos.write(data.getBytes());
		System.out.println("Data inserted...........");
		fos.close();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="C:\\Users\\divya\\OneDrive\\Desktop\\JavaPrograms\\JavaPractice\\src\\com\\streams\\abc.txt";
		
		File f=new File(location);
		String str="Java is an awesome language";
		if(f.exists()) {
			FileStreams2.addDataToFile(location, str);
			
		}else {
			System.out.println("File not found");
			boolean newfile=f.createNewFile();
			System.out.println("File created");
			if(newfile) {
				FileStreams2.addDataToFile(location, str);
			}
			
		}
	}

}
