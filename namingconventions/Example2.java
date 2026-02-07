package namingconventions;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Govind";
//		System.out.println(Name); //It gives error because variables are case-sensitive in java
		System.out.println(name);
		
//		int @id=55; //Variable names should not start with Symbols except "_" and "$"
		int _id=55;
		int $id=35;
		System.out.println(_id);
		System.out.println($id);
		
//		char 1ch='a'; // Variable names should not start with numbers
		
		char ch='a';
		System.out.println(ch);
		
//		boolean var bool=false; //cannot use space between variables
		
		boolean var_bool=false;
		System.out.println(var_bool);
		
		String course1 ="Java"; //Variables should not start with numbers but can be used in betweeen names 
		System.out.println(course1);
		
//		byte byte=67; // cannot use resrved keywords as variable names
		byte byt=67; 
		System.out.println(byt);

	}

}
