package com.filehandling;

import java.io.*;
public class FileStreams {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		String location ="C:\\Users\\divya\\OneDrive\\Desktop\\JavaPrograms\\JavaPractice\\src\\com\\streams\\sample2.txt";
		File file=new File(location);
		System.out.println(file.exists());
		file.createNewFile();
//		System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
		fis.read();
		
		String str="Hello World";
		FileOutputStream fos=new FileOutputStream(file);
		
		byte[] bytes=str.getBytes();
		fos.write(bytes);
//		fos.write(str.getBytes());
		
		fos.close();
	}

}
