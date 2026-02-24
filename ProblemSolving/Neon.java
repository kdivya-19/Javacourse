package Problemsolving;

public class Neon {
	public static boolean isNeon(int num) {
		int square=num*num;
		int sum=0;
		while(square>0){
			sum+=square%10;
			square/=10;
		}
		if(sum!=num){
			return false;
		}
		return true;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(isNeon(i)){
			   System.out.println(i+" is a Neon number");
			}
			else {
				 System.out.println(i+" is not a Neon number");
			}
		}

	}

}
