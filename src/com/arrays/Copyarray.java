package com.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the "+i+" index element: ");
			int element=sc.nextInt();
			arr[i]=element;
		}
		
		int[] arr2=new int[size];
		for(int i=0;i<size;i++) {
			arr2[i]=arr[i];
		}
		
		System.out.println("Elements copied to new array: "+Arrays.toString(arr2));
		
		sc.close();
	}

}
