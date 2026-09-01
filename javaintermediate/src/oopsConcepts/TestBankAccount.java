package oopsConcepts;

public class TestBankAccount {

	public static void main(String[] args) {

		BankAccount ba= new BankAccount();
		
		System.out.println("*********Welcome to SBI Bankings*********");
		
	     ba.setaccountNumber(671234567);
	     ba.setholdername("BOSS");
	     
	
	     
	     ba.setdeposit(2000);
	     
	     ba.setwithdraw(2000);
	     
	     
	     
	     
	     System.out.println("Account Number:- "+ba.getaccountNumber());
	     System.out.println("Account Holder Name:- "+ ba.getholdername());
	     System.out.println("Current Balance Amount:-"+ba.getbalance());
	     
	     
	     
	    
	     
	}

}

/*
 * Java- 1.Create a BankAccount class using Encapsulation. Declare
 * accountNumber, holderName, and balance as private. Initialize the balance
 * with ₹5000 using a constructor or directly. Create a deposit(double amount)
 * method to add money to the account. Create a withdraw(double amount) method
 * that allows withdrawal only if the balance is sufficient. In main(), create
 * an object, perform deposit and withdrawal operations, and display the final
 * balance.
 */


