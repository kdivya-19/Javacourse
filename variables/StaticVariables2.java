package com.variables;

public class StaticVariables2 {

	public static int count=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables2 obj1=new StaticVariables2();
		StaticVariables2 obj2=new StaticVariables2();
		obj1.count=7;
		System.out.println(obj1.count);
		System.out.println(obj2.count);
		obj2.count=9;
		System.out.println(obj1.count);
		System.out.println(obj2.count);
		
		StaticVariables2 obj3=new StaticVariables2();
		obj3.count=10;
		System.out.println(obj1.count);
		System.out.println(obj2.count);
		System.out.println(obj3.count);
		
		StaticVariables2 obj4=new StaticVariables2();
		obj4.count=10;
		System.out.println(obj1.count);
		System.out.println(obj2.count);
		System.out.println(obj3.count);
		System.out.println(obj4.count);
		
		StaticVariables2 obj5=new StaticVariables2();
		obj5.count=10;
		System.out.println(obj1.count);
		System.out.println(obj2.count);
		System.out.println(obj3.count);
		System.out.println(obj4.count);
		System.out.println(obj5.count);
		
		System.out.println("Final count= "+count);
	}

}
