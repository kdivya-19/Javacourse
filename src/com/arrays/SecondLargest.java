package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,35,1,10,24,1};
		int max2=0;
		int max_val=arr[0];
		for(int i=0;i<arr.length;i++) {
			max_val=(int)Math.max(max_val, arr[i]);
			if(arr[i]>max2 && arr[i]!=max_val) {
				max2=arr[i];
			}
		}
		
		System.out.println(max2);
	}

}
