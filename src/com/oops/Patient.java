package com.oops;

public class Patient {
	
	int patientId;
	String name;
	double[] testResults;
	
	public Patient(int patientId,String name,double[] testResults) {
		this.patientId=patientId;
		this.name=name;
		this.testResults=testResults;
		
	}
	
	public double getAverageresult() {
		double sum=0;
		for(double ele:testResults) {
			sum+=ele;
		}
		return sum/5;
	}
	
	public boolean hasCriticalVal() {
		for(double ele:testResults) {
			if(ele<50) {
				return true;
			}
		}
		return false;
	}
	
	public void displayPatientInfo() {
		System.out.println("Patient id: "+patientId);
		System.out.println("Patient name: "+name);
		System.out.println("Average test result: "+getAverageresult());
		System.out.println("Has critical value: "+hasCriticalVal());
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient p1=new Patient(1001,"John",new double[] {100,80,80,97,56});
		Patient p2=new Patient(1002,"John Doe",new double[] {78,45,80,97,56});
		Patient p3=new Patient(1003,"Michael",new double[] {88,85,70,99,66});
		Patient p4=new Patient(1004,"Henry",new double[] {40,80,82,60,43});
		Patient p5=new Patient(1005,"Harry",new double[] {60,70,80,97,90});
		
		
		Patient [] arr= {p1,p2,p3,p4,p5};
		for(Patient ele:arr) {
			if(ele.hasCriticalVal()) {
				ele.displayPatientInfo();
			}
		}
		
	}

}
