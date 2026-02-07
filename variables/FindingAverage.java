package com.variables;

public class FindingAverage {

	static void calculateAvg(int m1,int m2,int m3,int m4,int m5) {
		int avg=(m1+m2+m3+m4+m5)/5;
		System.out.println("Average= "+avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1=78;
		int sub2=67;
		int sub3=89;
		int sub4=46;
		int sub5=91;
		calculateAvg(sub1,sub2,sub3,sub4,sub5);

	}

}
