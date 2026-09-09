package oopsConcepts.Polymorphism;

public class PizzaOrder extends OrderDetails implements FoodOrder {


	PizzaOrder(int od, String cn, double p) {
		super(od, cn, p);
	}
	
	@Override
	public void prepareFood() {
		System.out.println("Pizza is preparing...");
	}


}


/*
 * 1.Create an interface FoodOrder with prepareFood(). Create a base class
 * OrderDetails with orderId, customerName, price, and displayDetails(). Create
 * PizzaOrder and BurgerOrder classes that extend OrderDetails and implement
 * FoodOrder. Override prepareFood() in both classes and demonstrate runtime
 * polymorphism in main().
 */