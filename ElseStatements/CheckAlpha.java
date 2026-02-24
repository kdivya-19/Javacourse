package ElseStatements;

public class CheckAlpha {
	String checkalpha(char c) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			return "Vowel";
			
		}else {
			return "Consonant";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAlpha o1=new CheckAlpha();
		System.out.println(" 'z' is: "+o1.checkalpha('z'));
		System.out.println(" 'e' is: "+o1.checkalpha('e'));
	}

}
