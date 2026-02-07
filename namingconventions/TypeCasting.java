package namingconventions;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f=123.90f;
		int n=(int)f;
		
		char c=78;// For char we can give numbers but not of numbers decared as int;
//		char c2=n;  // It gives error becoz " n" is also a number but it is declared as int 
		
		byte b=24;// same as char
		System.out.println(b);
//		byte b2=n;// it gives error;
		byte b2=(byte)n;
		System.out.println(b2);
		
		int n2=c;//assigning char value to int
		System.out.println(n2);
		
		int n3=b;//  assing byte value to int
		System.out.println(n3);
		
		double d=n;  //assining int -double
		int n4=(int)d; //double - int
		
		double d2=c; //assigning char to double
		double d3=b;//assigning byte to double
		double d4=f; //assigning float to double
		
		float f2=c;//assigning char to float
		float f3=b;//assigning byte to float
		float f4=n; //assigning int  to float
		
		
		

	}

}
