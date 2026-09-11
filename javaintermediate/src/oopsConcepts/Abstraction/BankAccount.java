package oopsConcepts.Abstraction;

public interface BankAccount {
	
	public abstract void WithdrawAmount(double amount);
	
	public abstract void DepositAmount(double amount);
	
	 static void WelcomeRules() {
		System.out.println("Welcome to SBI Bankings!!");
		System.out.println("RULE 1:- DONT SHARE YOUR PIN NUMBER OR OTP");
		System.out.println("RULE 2:- DONT CONTACT THIRD PERSON FOR BANK WORKS");
		System.out.println("RULE 3:- DONT SHARE YOUR PERSONAL DETAILS WITH ANYONE");
		
	}
	 
	public abstract void Loan();
	
}
