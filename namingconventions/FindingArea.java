package namingconventions;

public class FindingArea {
	
	  final static double pi=Math.PI;
	
	
	public static void findArea(int radius) {
		System.out.println("area of circle of radius "+radius+" is = "+(pi*radius*radius));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findArea(6);
		

	}

}
