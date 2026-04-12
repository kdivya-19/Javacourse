package com.filehandling;

import java.io.*;
public class FileStreams3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="C:\\\\Users\\\\divya\\\\OneDrive\\\\Desktop\\\\JavaPrograms\\\\JavaPractice\\\\src\\\\com\\\\streams\\\\abc.txt";
		FileInputStream fis=new FileInputStream(location);
		
		System.out.println(fis.read());
		
		String location2="C:\\\\Users\\\\divya\\\\OneDrive\\\\Desktop\\\\JavaPrograms\\\\JavaPractice\\\\src\\\\com\\\\streams\\\\abc2.txt";
		File file=new File(location2);
		file.createNewFile();		
		
		FileOutputStream fos=new FileOutputStream(file);
		
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
			fos.write((char)i);
		}
		
		fis.close();
		fos.close();
		
	}

}
