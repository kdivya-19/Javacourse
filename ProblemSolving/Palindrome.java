package Problemsolving;

public class Palindrome {
	
	static boolean checkPalindrome(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {
			sum=sum*10+num%10;
			num/=10;
		}
		return sum==temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1435;
		if(checkPalindrome(num)) {
			System.out.println(num+"is a Palindrome");
		}else {
			System.out.println(num+"is not a Palindrome");
		}
		num=45254;
		if(checkPalindrome(num)) {
			System.out.println(num+" is a Palindrome");
		}else {
			System.out.println(num+" is not a Palindrome");
		}
	}

}
