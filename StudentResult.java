import java.util.Scanner;

public class StudentResult {
	
	private String  studentName;
	private int studentID;
	private String courseName;
	private double totalMarks;
	private int count=1;
	
	public StudentResult(String studentName,int studentID,String courseName,double totalMarks) {
		this.studentName=studentName;
		this.studentID=studentID;
		this.courseName=courseName;
		this.totalMarks=totalMarks;
	}
	
	public void addMarks(double marks) {
		if(marks<0) {
			System.out.println("Invalid marks entered");
		}
		totalMarks+=marks;
		System.out.println("Successfully updated your marks");
		count++;
	}
	
	public void CalculateGrade() {
		double temp=totalMarks/count;
		if(temp>=90) {
			System.out.println("Grade A");
		}else if(temp>=80) {
			System.out.println("Grade B");
		}else if(temp>=70) {
			System.out.println("Grade C");
		}else if(temp>=60) {
			System.out.println("Grade D");
		}else if(temp<60 && temp>0) {
			System.out.println("Fail");
		}else {
			System.out.println("No marks available to calculate");
		}
	}

	public void showTotalMarks() {
		if(totalMarks>0) {
		System.out.println("Your total marks are: "+totalMarks);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter your Name: ");
			String name=sc.next();
			System.out.println("Enter your ID: ");
			int Id=sc.nextInt();
			System.out.println("Enter your courseName: ");
			String course=sc.next();
			System.out.println("Enter your First Subject marks (for 100): ");
			double marks=sc.nextDouble();
			StudentResult obj=new StudentResult(name,Id,course,marks);
			System.out.println("Student Record Created successfully");
			
			System.out.println("-----Select your option----");
			System.out.println("1. Add more subject marks ");
			System.out.println("2. Calculate Grade");
			System.out.println("3. View Total marks");
			System.out.println("I4. Exit");
			
		while(true) {
			System.out.println("Enter an option from 1-4: ");
			int option=sc.nextInt();
			if(option==1) {
				System.out.println("Enetr your  subject-"+(obj.count+1)+" marks (for 100) : ");
				int marks2=sc.nextInt();
				obj.addMarks(marks2);
				
			}else if(option==2) {
				obj.CalculateGrade();
			}
			else if(option==3) {
				obj.showTotalMarks();
			}
			
			else if(option==4){
				System.out.println("Thank You! Result processing completed");
				break;
			}else {
				System.out.println("Invalid option");
			}
		}
		

	}

}
