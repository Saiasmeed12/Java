package oopsConcepts;

public class Worker01 {
	
	private int WorkerID;
	private String WorkerName;
	private double salary;
	
	
	public Worker01() {
		salary=30000;
	}
	
	public void setWorkerID(int WorkerID) {
		this.WorkerID= WorkerID;
	}
	
	int getWorkerID() {
		return WorkerID;
	}
	
	
	
	public void setWorkerName(String WorkerName) {
		this.WorkerName= WorkerName;
		
	}
	
	String getWorkerName() {
		return WorkerName;
	}
	
	
	public void increaseSalary(double amount) {
		salary = salary + amount;
		
	}
	
	public void deductSalary(double amount) {
		if(amount >0 && amount<=salary ) {
			salary= salary-amount;
		}
		else {
			System.out.println("insufficient Amount");
		}
	}
	
	public double getsalary() {
		return salary;
	}
}


/*
 * Create an Worker class using Encapsulation.
 * 
 * Declare WorkerId, WorkerName, and salary as private. Initialize
 * WorkerId and WorkerName using setters. Initialize salary with ₹30,000
 * using a constructor. Create a getSalary() method to return the salary. Create
 * an increaseSalary(double amount) method to increase the salary. Create a
 * deductSalary(double amount) method that deducts the amount only if sufficient
 * salary is available. In main(), create an object, set Worker details,
 * increase salary, deduct some amount, and display the final salary.
 * 
 * Example operations: Workers ID = 101 Workers Name = BOSS Initial Salary =
 * ₹30,000 Increase = ₹5,000 Deduct = ₹8,000
 * 
 * Expected final salary: ₹27,000
 */