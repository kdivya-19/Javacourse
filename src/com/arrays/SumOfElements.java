package com.arrays;
import java.util.*;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		
		if(n<=0) {
			System.out.println("Invalid size ");
			
		}
		else {
			
			int[] arr=new int[n];
			System.out.println("Enter "+n+" elements");
			for(int i=0;i<n;i++) {
				int element=sc.nextInt();
				arr[i]=element;
			}
			int sum=0;
			for (int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			System.out.println("Sum or elements of the array is: "+sum);
		}
		sc.close();

	}

}
