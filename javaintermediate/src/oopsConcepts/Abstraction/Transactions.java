package oopsConcepts.Abstraction;

public class Transactions extends TestAbs {

	double Balance =12000;
	
	
	@Override
	public void WithdrawAmount(double amount) {
		BankAccount.WelcomeRules();
		System.out.println("******************************************************");
		System.out.println("The current WithDrawal Amount is:- "+amount);
		if(amount<= Balance) {
		Balance= Balance - amount;
		balance();
		
	}
	}

	@Override
	public void DepositAmount(double amount) {
		System.out.println("The current Deposit Amount is:- "+amount);
		Balance= Balance + amount;
		balance();
		
	}
	
	void balance() {
		System.out.println("The Current Balance is:- "+Balance);
		
	}
	
	
	

}
