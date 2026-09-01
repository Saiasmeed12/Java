package oopsConcepts;

public class ShoppingCart2 {

	public static void main(String[] args) {

		ShoppingCart sc= new ShoppingCart();
		
		System.out.println("****WELCOME TO FLIPKART***");
		
		sc.AddItems(1000);       
		sc.RemoveItems(200);     
		sc.AddItems(800);
		
		
		//System.out.println("Cart Items No:-"+sc.getCart());
		System.out.println("Total Amount is:-"+sc.gettotal());
	}

}
