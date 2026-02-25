package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

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
			
			System.out.println("Array in reverse order:");
			for(int i=n-1;i>=0;i--) {
				System.out.println(arr[i]);
			}
			
			
			int last=n-1;
			int first=0;
			while(first<=last) {
				int temp=arr[first];
				arr[first]=arr[last];
				arr[last]=temp;
				first++;
				last--;
			}
			System.out.println("Array in reverse order:  "+Arrays.toString(arr));
			
		}
		sc.close();
		

	}

}
