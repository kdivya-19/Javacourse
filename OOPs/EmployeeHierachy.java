package OOPs;

class Employees{
	private String name;
	private double basesalary;
	
	public Employees( String name,double basesalary) {
		this.name=name;
		this.basesalary=basesalary;
	}
	
	public double calculateAnnualSal() {
		return basesalary;
	}
	
}

class Manager extends Employees{
	private double bonus;
	private int numOfEmpmanaged;
	
	public Manager(String name,double basesalary, double bonus,int numOfEmpmanaged) {
		super(name,basesalary);
		this.bonus=bonus;
		this.numOfEmpmanaged=numOfEmpmanaged;
	}
	
	public double calManagerSal() {
		return calculateAnnualSal()+bonus;
	}
	
}

class Engineer extends Employees{
	private int projectCount;
	
	public Engineer(String name,double basesalary, int projectCount) {
		super(name,basesalary);
		this.projectCount=projectCount;
		
	}
	
	public double calEngineerSal() {
		return calculateAnnualSal()+projectCount*1000;
	}
	
}

class Salesperson extends Employees{
	private double commissionRate;
	private int totalsales;
	
	public Salesperson(String name,double basesalary, double commissionRate,int totalsales) {
		super(name,basesalary);
		this.commissionRate=commissionRate;
		this.totalsales=totalsales;
		
	}
	
	public double calSalespersonSal() {
		return calculateAnnualSal()+commissionRate*totalsales;
	}
	
}

public class EmployeeHierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees manager=new Manager("Alice",50000,10000,5);
		System.out.println("Base salary: "+manager.calculateAnnualSal());
		Manager m=(Manager)manager;
		System.out.println("Manager salary: "+m.calManagerSal());
		System.out.println();
		
		Employees eng=new Engineer("Bob",70000,5);
		System.out.println("Base salary: "+eng.calculateAnnualSal());
		Engineer e=(Engineer)eng;
		System.out.println("Engineer salary: "+e.calEngineerSal());
		System.out.println();
		
		
		Employees sales=new Salesperson("Charlie",40000,0.1,200000);
		System.out.println("Base salary: "+sales.calculateAnnualSal());
		Salesperson s=(Salesperson)sales;
		System.out.println("Engineer salary: "+s.calSalespersonSal());
	}

}
