package com.arrays;

import java.util.Arrays;

public class FindingFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,3,3,2,1,4,2,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		int prev=arr[0];
		int count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=prev) {
				prev=arr[i];
				count++;
			}
			
		}
		System.out.println(count);
		
		int[] arr2=new int[count];
		
		
		//method 1
//		int index=0;
//		int current=arr[0];
//		int count2=1;
//		int res=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=res+1;j<arr.length;j++) {
//				if(arr[j]==current) {
//					count2++;
//				}
//				else {
//					 res=j;
//					break;
//				}
//			}
//			 
//			arr2[index]=count2;
//			System.out.println(Arrays.toString(arr2));
//			current=arr[res];
////			count2=1;
//			count2=1;
//			index++;
//			
//		}
//		System.out.println(Arrays.toString(arr2));
		
		
		
		//method 2
		int index=0;
		int c=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]!=arr[i]) {
				arr2[index]=c;
				index++;
				c=1;
			}else {
				c++;
			}
		}
		arr2[count-1]=c;
			
		System.out.println(Arrays.toString(arr2));
		

	}

}
