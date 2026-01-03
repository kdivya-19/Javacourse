package com.college.service;

public class StudentService{
	
	public double calsulateDuscountedFee(double fee, String dept) {
		if(dept.equals("IT")) {
			return fee*(0.1);
		}
		return 0;
	}

}