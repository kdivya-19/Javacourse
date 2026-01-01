public class DuckNumber {
	public static boolean checkDeckNumber(String num) {
		
		if(num.charAt(0)=='0') {
			return false;
		}
		else {
			int temp=Integer.valueOf(num);
			while(temp>0) {
				if(temp%10==0) {
					return true;
			    }
			   temp/=10;
			}
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		String str="9098";
		if(checkDeckNumber(str)) {
			System.out.println(str+" : is a  Duck Number");
		}else {
			System.out.println(str+" : is NOT a Duck Number");
		}
		
		str="0009875608";
		if(checkDeckNumber(str)) {
			System.out.println(str+" : is a  Duck Number");
		}else {
			System.out.println(str+" : is NOT a Duck Number");
		}
		str="567344";
		if(checkDeckNumber(str)) {
			System.out.println(str+" : is a  Duck Number");
		}else {
			System.out.println(str+" : is NOT a Duck Number");
		}
	}
}
