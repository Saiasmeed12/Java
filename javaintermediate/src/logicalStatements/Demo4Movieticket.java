package logicalStatements;

import java.util.Scanner;

public class Demo4Movieticket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** You Can Buy To Below Tickets");
		System.out.println("Enter 1 For Silver Ticket(200 Rupees)");
		System.out.println("Enter 2 For Gold Ticket(300 Rupess)");
		System.out.println("Enter 3 For Platinum Ticket(500 Rupees)");

		System.out.println("Enter Your Ticket Type:-");
		int ticket =sc.nextInt();
		
		switch(ticket) {
		case 1 -> 
		{
			System.out.println("You have Entered Silver Screening ");
			int price =200;
			System.out.println("Enter your Age:-");
			int age =sc.nextInt();
			if(age>=60) 
			{
				System.out.println("Thanks for You Providing Your Age, You are Eligible For Senior Citizen Discount");
				System.out.println("Enter Aadhaar Number for Age Verification:-");
				long aadhar =sc.nextLong();
				System.out.println("Your Aadhar Number is:-"+aadhar);
				System.out.println("Aadhaar Verified ✅, Thanks For Your Patience");
				System.out.println("Ticket Price is :- "+price *0.90);
			
		     }
			else {
				System.out.println("The Ticket Price is:- "+price);
	
			}
			
			}
		case 2 -> 
		{
			System.out.println("You have Entered Gold Screening ");
			int price2 =300;
			System.out.println("Enter your Age:-");
			int age =sc.nextInt();
			if(age>=60) 
			{
			    System.out.println("Thanks for You Providing Your Age, You are Eligible For Senior Citizen Discount");
				System.out.println("Enter Aadhaar Number for Age Verification:-");
				long aadhar =sc.nextLong();
				System.out.println("Your Aadhar Number is:-"+aadhar);
				System.out.println("Aadhaar Verified ✅, Thanks For Your Patience");
				System.out.println("Ticket Price is :- "+price2*0.90);
			
		     }
			else {
				System.out.println("The Ticket Price is:- "+price2);
	
			}
		
		 }
		case 3 -> 
		{
			System.out.println("You have Entered Platinum Screening ");
			int price3=500;
			System.out.println("Enter your Age:-");
			int age =sc.nextInt();
			if(age>=60) 
			{
			    System.out.println("Thanks for You Providing Your Age, You are Eligible For Senior Citizen Discount");
				System.out.println("Enter Aadhaar Number for Age Verification:-");
				long aadhar =sc.nextLong();
				System.out.println("Your Aadhar Number is:-"+aadhar);
				System.out.println("Aadhaar Verified ✅, Thanks For Your Patience");
				System.out.println("Ticket Price is :- "+price3*0.90);
			
		     }
			else {
				System.out.println("The Ticket Price is:- "+price3);
	
			}
			}
		
		 default -> System.out.println("Inconvenience In Booking Ticket, Lets Us Know- Through Feedback ");
		
		}//switch
		
		sc.close();

	}//main

}//class
/**Java Assignment
Question:
1.A movie theater offers three types of tickets:
1 → Silver (₹200)
2 → Gold (₹300)
3 → Platinum (₹500)
•Write a Java program that:
•Accepts the ticket type and customer's age as input.
•Uses a switch statement to determine the ticket type and price.
•Uses an if statement inside each case to check whether the customer is a senior citizen (age ≥ 60).
•If the customer is a senior citizen, apply a 10% discount on the ticket price.
•Display the ticket type and the final ticket price.
Output
Select Ticket Type:
1. Silver - Rs.200
2. Gold - Rs.300
3. Platinum - Rs.500
4. Exit
Enter your choice: 2
Enter your age: 65
Gold Ticket Price: Rs.270.0

Select Ticket Type:
1. Silver - Rs.200
2. Gold - Rs.300
3. Platinum - Rs.500
4. Exit
Enter your choice: 4
Thank you! Visit Again.**/