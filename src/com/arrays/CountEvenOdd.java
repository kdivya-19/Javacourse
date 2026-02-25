package com.arrays;
import java.util.*;

import java.util.Scanner;

public class CountEvenOdd {

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
			int even=0;
			int odd=0;
			for (int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					even++;
				}
				else {
					odd++;
				}
			}
			System.out.println("Even count = "+even);
			System.out.println("Odd count = "+odd);
		}
		sc.close();

	}

}
