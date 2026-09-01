package oopsConcepts;

import java.util.Scanner;

public class BankAccount {
	
	static Scanner sc = new Scanner(System.in);

	private  int accountNumber;
	private String holderName;
	private double balance;
	

	public BankAccount() {
		 balance=5000;
	}
	public void setaccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	int getaccountNumber() {
		return accountNumber;
	}
	
	
	public void setholdername(String holderName) {
		this.holderName= holderName;
		
	}
	
	String getholdername() {
		return holderName;
	}
	
	
	double getbalance() {
		return balance;
	}
	
	
	double amount() {
		System.out.println("Enter your Amount");
		double a=sc.nextDouble();
		return a;
		
	}
	public void setdeposit(double amount) {
		balance=balance + amount;
	}
	
	double getdeposit(double amount) {
		return balance;
	}
	
	public void setwithdraw(double amount) {
		if(amount <=balance) {
			balance = balance-amount;
		}
		else {
			System.out.println("insuffient balance");
		}
	}
	

}//class


/*
 * Java- 1.Create a BankAccount class using Encapsulation. Declare
 * accountNumber, holderName, and balance as private. Initialize the balance
 * with ₹5000 using a constructor or directly. Create a deposit(double amount)
 * method to add money to the account. Create a withdraw(double amount) method
 * that allows withdrawal only if the balance is sufficient. In main(), create
 * an object, perform deposit and withdrawal operations, and display the final
 * balance.
 */