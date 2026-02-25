package com.arrays;
import java.util.*;

public class Mainprgm {
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
			
	}

	public static boolean isPalindrome(int n) {
		int temp=n;
		int sum=0;
		while(n>0) {
			sum=sum*10+n%10;
			n/=10;
		}
		return sum==temp;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2=com.arrays.Example1.getIntArray();
		
		for(int ele:arr2) {
			if(isPrime(ele)) {
				System.out.println(ele);
			}
		}
	
		for(int i=0;i<arr2.length;i++) {
			if(isPrime(arr2[i])) {
				System.out.println(arr2[i]);
			}
			
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(isPalindrome(arr2[i])) {
				System.out.println(arr2[i]);
			}
			
		}

	}

}
