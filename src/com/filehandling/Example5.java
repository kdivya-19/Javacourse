package com.filehandling;

import java.io.*;
public class Example5 {
	
	public void addData(String location, String name, int password) throws IOException {
		
		FileWriter fw=new FileWriter(location);
		
		fw.write(name);
		
		fw.write(password);
		
		fw.close();
		System.out.println("Registration successful ");
	}
	
	public void readData(String location, String name, int password) throws IOException {
		FileReader fr=new FileReader(location);
		String str=name+password;
		int i;
		int j=0;
		boolean b=true;
		while((i=fr.read())!=-1) {
			if((char)i!=str.charAt(j)) {
				b=false;
				break;
			}
			j++;
		};
		if(b) {
			System.out.println("Login successful ");
		}else {
			System.out.println("Login failed ");
		}
		fr.close();
		
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		
		
		
		

	}

}
