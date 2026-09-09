package oopsConcepts.Polymorphism;


public class TestDemo1 {

	public static void main(String[] args) {

		FoodOrder order;
		OrderDetails details;
		
		details= new PizzaOrder(101,"uday",234.0);
		details.displayDetails();
		
		order= new PizzaOrder(101,"uday",234.0);
		order.prepareFood();
		
		
		details= new BurgerOrder(102,"rushi",288.0);
		details.displayDetails();
		
		order= new BurgerOrder(102,"rushi",288.0);
		order.prepareFood();
		
		
	}

}
