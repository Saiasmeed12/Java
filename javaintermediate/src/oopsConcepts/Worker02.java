package oopsConcepts;

public class Worker02 {

	public static void main(String[] args) {


		Worker01 w = new Worker01();
		
		
		
		w.setWorkerID(101);
		w.setWorkerName("BOSS");
		
		System.out.println("Inital Balance:-"+w.getsalary());
		
		w.increaseSalary(10000);
		w.deductSalary(2000);
		
		
		System.out.println("Worker ID:- "+w.getWorkerID());
		System.out.println("Worker Name:- "+w.getWorkerName());
	
		System.out.println("Final Salary:- "+w.getsalary());
		
		
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