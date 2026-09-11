package oopsConcepts.Abstraction;

public class TestBankAccount {

	public static void main(String[] args) {

		Transactions t= new Transactions();
		
		t.balance();
		t.WithdrawAmount(4000);
		t.DepositAmount(1000);
		
		
			
	}

}
