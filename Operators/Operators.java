package Operators;

public class Operators {
	    int a, b;
	    void operations(){
	        System.out.println(a+b);
	        System.out.println(a-b);
	        System.out.println(a/b);
	        System.out.println(a*b);
	        System.out.println(a%b);
	        
	        
	        //Bitwise operators
	        System.out.println(a&b);
	        System.out.println(a&1);
	        System.out.println(a|b);
	        System.out.println(a^b);
	        System.out.println(a>>3);
	        System.out.println(a<<2);
	        
	        
	        System.out.println(a>b);
	        
	        //Unary operators
	        
	        System.out.println(a++);
	        System.out.println(a);
	        System.out.println(++b);
	        System.out.println(b);
	        
	        
	        //Compound operators
	        int x=2;
	        int y=5;
	        x+=y;
	        System.out.println(x);
	         x-=y;
	         System.out.println(x); 
	        
	         x*=y;
	         System.out.println(x); 
	         x/=y;
	         System.out.println(x); 
	        
	        
	        boolean x=true, y=false;
	        System.out.println(x&&y);
	        System.out.println(x||y);
	        String s1="hello", s2="world";
	        System.out.println(s1+s2);
	        byte b1=9;
	        byte b2=0;
	        // // System.out.println(b1/b2);//It will give error 

	        int a1=9;
	        int a2=0;
	        // System.out.println(a1/a2);//It will give error 
	        System.out.println(b1/0.0);//It gives infinity
	        System.out.println(a1/0.0);//It gives Infinity if any one number if float/double

	        char c1=34;//char takes numbers also
	        char c2=56;
	        System.out.println(c1+c2);

	        System.out.println(23+'a'); //char+int is possibleit gives a numerical no
	        System.out.println(23.7+'a'); //char +any numerical or decimal is possible
	        System.out.println(23.7*'a');
	        System.out.println(23.7/'a');
	        System.out.println(b2+'a');
	        // System.out.println(true+'a'); //It gives error
	        //System.out.println(23.7+false);
	        float f1=4.5f;
	        System.out.println(f1/'d');
	        // System.out.println(true+true); //It gives error
	    }


	    public static void main(String[] args){
	        Operators obj=new Operators();
	        obj.a=5;
	        obj.b=10;
	        obj.operations();
	        System.out.println("hello world");
	    }

	}
	// two public classes are not allowed in a single java file.
