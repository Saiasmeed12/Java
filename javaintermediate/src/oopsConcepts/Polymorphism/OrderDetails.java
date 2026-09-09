package oopsConcepts.Polymorphism;

public class OrderDetails {
	int orderId;
	String customerName;
	double price;
	
	
	OrderDetails(int od,String cn,double p){
		this.customerName=cn;
		this.orderId=od;
		this.price=p;
		
	}
	
	void displayDetails() {
		System.out.println("---ORDER INFO---");
		System.out.println("Orderid:-"+orderId);
		System.out.println("customerName:-"+customerName);
		System.out.println("Price of item:-"+price);
	}

}


/*
 * 1.Create an interface FoodOrder with prepareFood(). Create a base class
 * OrderDetails with orderId, customerName, price, and displayDetails(). Create
 * PizzaOrder and BurgerOrder classes that extend OrderDetails and implement
 * FoodOrder. Override prepareFood() in both classes and demonstrate runtime
 * polymorphism in main().
 */