package com.exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String s=null;
			
			System.out.println(s.toUpperCase());
			System.out.println(s.charAt(1));
			//Both above cases are NUllPointerExceptions
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.err.println(e.getMessage());
		}
		
//	   catch(Throwable e) {
//		   System.out.println(e);
//	   }
//		catch(Exception ex) {
//			System.out.println(ex);
//		}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}
//		catch(Exception ex) {
//			System.out.println(ex);
//		}

		System.out.println("Executed");
	}

}
