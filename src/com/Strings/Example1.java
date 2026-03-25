package com.Strings;

public class Example1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="java";
		String str2="java";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String replaceStr=str2.replace("java", "hello");
		System.out.println(replaceStr);
		
		String str3=new String("java");
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		String str4=" is awesome";
		String str5=str1+str4;
		String str6="java is awesome";
		System.out.println(str5==str6);
		System.out.println(str5.intern()==str6);//Using intern we can give address i.e we can store object strings in SCP(String constant pool
		System.out.println(str5.equals(str6));
		
		String st1=new String("Gambler");
		String st="Gambler";
		System.out.println(st==st1);//here it gets "FALSE"
		System.out.println(st==st1.intern());;// Here we gets true 
		
		String str7="Hello ";
		str7.concat("Everyone");
		System.out.println(str7);//String cannot be modified
		
		
//		By using StringBuilder /Stringbuffer we can modify Strings 
		StringBuilder strbuilder=new StringBuilder("Hello ");
		strbuilder.append(" EveryOne");
		System.out.println(strbuilder);//String is modified
		
		StringBuffer strbuffer=new StringBuffer("Java ");
		strbuffer.append("is ").append("awesome");
		System.out.println("String after modifying : "+strbuffer);
		System.out.println("Reversing String : "+strbuffer.reverse());
		
	}
}
