package ElseStatements;

public class LoanApproval {
	
	public String checkLoanApproval(double salary, int creditscore) {
		if(salary>80000 && creditscore>750) {
			return "Loan Aprroved Immediately";
		}
		else if(salary>50000  && salary<=80000 && creditscore>650){
			return "Loan approved with higher Interest Rate";
			
		}
		else if(salary>30000 && salary<=50000 && creditscore>500) {
			return "Co-signer required";
		}else {
			return "Loan Rejected";
		}
			
	}

	public static void main(String[] args) {
		LoanApproval ob=new LoanApproval();
		System.out.println(ob.checkLoanApproval(85000,850));
		System.out.println(ob.checkLoanApproval(60000,7000));
		System.out.println(ob.checkLoanApproval(45000,550));
		
		System.out.println(ob.checkLoanApproval(75000,550));

	}

}
