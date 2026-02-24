package Variables;

public class StaticVariables {
	
	public static String insName="Kakatiya";
	public static int stId=45;
	public String Name="Divya";
	
	public void printData() {
		System.out.println("Name: "+insName+"\nRoll no= "+stId+"\nName: "+Name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables o1=new StaticVariables();
		StaticVariables o2=new StaticVariables();
		o1.printData();
		o2.printData();
		System.out.println("----------------\n");
		
		o1.insName="SVS"; //here even if we changed the o1.insName it also changes o2 becoz insName is a static variable 
		o1.printData();
		o2.printData();
		System.out.println("----------------\n");
		
		o2.stId=56;
		o1.printData();
		o2.printData();
		System.out.println("----------------\n");
		
		o2.Name="Shivani"; //It changes only the Name of o2 
		o1.printData();
		o2.printData();
		System.out.println("----------------\n");
		
		System.out.println(insName);
	}

}

