package oopsConcepts.Polymorphism;

public class BurgerOrder extends OrderDetails implements FoodOrder {
	
	
	BurgerOrder(int od, String cn, double p) {
		super(od, cn, p);
	}

	public void prepareFood() {
		System.out.println("Burger is preparing...");
	}
	

}
