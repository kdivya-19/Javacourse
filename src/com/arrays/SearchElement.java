package com.arrays;
import java.util.*;

import java.util.Scanner;

public class SearchElement {

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
			
			System.out.println("Enter the element to be searched: ");
			int search=sc.nextInt();
			
			for (int i=0;i<arr.length;i++) {
				if(arr[i]==search) {
					System.out.println("Element found at position: "+(i+1));
					break;
				}
			}
			
		}
		sc.close();

	}

}
