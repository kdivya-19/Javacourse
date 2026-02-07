package Variables;

public class Instancevar {
	public int age=23;
	public void printdata() {
		System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancevar obj=new Instancevar();
		obj.printdata();
//		System.out.println(age);It gives error 
		obj.age=78;
		System.out.println(obj.age);
		
	}

}


//public class Instancevar {
//	public int age=25;
//	public static void printdata(int age) {
//		System.out.println(age);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Instancevar obj=new Instancevar();
//		printdata(obj.age);
//	}
//
//}
