package OOPs;

class Student{
	private String name;
	private int stdId;
	
	public Student( String name, int stdId) {
		this.name=name;
		this.stdId=stdId;
	}
	
	public void displayStdInfo() {
		System.out.println("Student name: "+name);
		System.out.println("Student id: "+stdId);
	}
}

class Undergraduate extends Student{
	
	private String major;
	
	public Undergraduate(String name,int stdId,String major ) {
		super(name,stdId);
		this.major=major;
	}
	public void displayUndGradInfo() {
		System.out.println("Major:"+major );
		
	}
}

class Graduate extends Student{
	
	private String thesisTopic;
	
	public Graduate(String name,int stdId,String thesisTopic ) {
		super(name,stdId);
		this.thesisTopic=thesisTopic;
	}
	public void displayGradInfo() {
		System.out.println("Thesis topic:"+thesisTopic );
		
	}
}

class PhdStudent extends Student{
	
	private String researchArea;
	
	public PhdStudent(String name,int stdId,String thesisTopic ) {
		super(name,stdId);
		this.researchArea=researchArea;
	}
	public void displayPhdInfo() {
		System.out.println("Research area:"+researchArea );
		
	}
}

public class StudentHierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Undergraduate("Alice",12,"Computer Science");
		std.displayStdInfo();
		Undergraduate unGrad=(Undergraduate)std;
		unGrad.displayUndGradInfo();
		System.out.println();
		
		Student std2=new Graduate("Bob",565,"Machine learning");
		std2.displayStdInfo();
		Graduate grad=(Graduate)std2;
		grad.displayGradInfo();
		System.out.println();
		
		Student std3=new PhdStudent("Charlie",789,"Artificial Intelligence");
		std3.displayStdInfo();
		PhdStudent phd=(PhdStudent)std3;
		phd.displayPhdInfo();
		
		
	}
}
