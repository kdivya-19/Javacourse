public class AutomorphicNumber {
	static boolean isAutomorphic(int n) {
		int sq=n*n;
		while(n>0) {
			if(n%10!=sq%10){
				return false;
				}
			n/=10;
			sq/=10;
			}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Automorphic numbers from 1-1000: ");
		for(int i=1;i<=1000;i++) {
	    	 if(isAutomorphic(i)){
	   	      System.out.println(i);
	   	      }
	     }
	}

}
