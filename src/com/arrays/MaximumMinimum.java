package com.arrays;

public class MaximumMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {3,9,2,5,6};
		
		int max_val=0;
		int min_val=arr[0];
		for(int element:arr) {
			max_val=(int)Math.max(max_val, element);
			min_val=(int)Math.min(element, min_val);
		}
		System.out.println(max_val);
		System.out.println(min_val);

	}

}
