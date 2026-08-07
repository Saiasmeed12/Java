package logicalStatements;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String yn;
		do {
		System.out.println("Enter the Jersey No:-");
		int jerseyno=sc.nextInt();
		
		switch(jerseyno) {
		
		case 1 -> {
			System.out.println("Jersey Number 1 belong to ");
		    System.out.println("Klassy Kl rahul");
		}
		
		case 4 ->{
			System.out.println("Jersey Number 4 belong to");
			System.out.println("Abhishek Sharma");
		}
		
		case 7->{
			System.out.println("Jersey Number 7 belong to");
			System.out.println("Captian Cool MSD");

		}
		
		case 10 -> {
			System.out.println("Jersey Number 10 belong to");
			System.out.println("GOD Of Cricket Sachin Tendulkar");
			
		}
		
		default -> System.out.println("Unknown player");
		
		
	}
		
		System.out.println("Do you want to continue:-YES/N0 ");
		yn=sc.next();
		
	}

		while(yn.equalsIgnoreCase("YES"));
		
		System.out.println("EXIT");
         sc.close();


}
}
