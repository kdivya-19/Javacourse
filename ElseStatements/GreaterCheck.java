package ElseStatements;

public class GreaterCheck {
		void checkGreater(int a,int b,int c) {
			if(a>b && a>c)
			{
				System.out.println(a+" is big");
			}
			else if(b>a && b>c)
			{
				System.out.println(b+" is big");
			}
			else if(c>a && c>b)
			{
				System.out.println(c+" is big");
			}
			else {
				System.out.println("not possible");
			}
			
			
		}
			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			GreaterCheck obj=new GreaterCheck();
//			obj.checkGreater(13,56,56);
			obj.checkGreater(13,56,56);
			String st=(false)? "hello":"Hi";	
			System.out.println(st);

	}

}
