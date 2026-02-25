package com.arrays;
import java.util.*;

public class Example1 {
	public static int[] getIntArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		
		if(n<=0) {
			System.out.println("Invalid size ");
			System.out.println("Enter size again");
			 n=sc.nextInt();
			
		}
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enetr "+i+" index element:");
			int element=sc.nextInt();
			arr[i]=element;
		}
		sc.close();
		
		return arr;
		
		
		
	}
	
	public static String[] getStringArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		
		if(n<=0) {
			System.out.println("Invalid size ");
			System.out.println("Enter size again");
			 n=sc.nextInt();
			
		}
		
		String[] arr=new String[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enetr "+i+" index element:");
			String element=sc.nextLine();
			arr[i]=element;
		}
		sc.close();
		
		return arr;
		
		
		
	}
	
	
	

}
