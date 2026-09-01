package oopsConcepts;

public class ShoppingCart {
	
	private  int cartItems;
	private  double totalamount;
	
	public void AddItems(double price) {
		cartItems++;
		totalamount= totalamount +price;
		
		
	}
	
	public void RemoveItems(double price) {
		if(cartItems>0 && price<= totalamount) {
			cartItems--;
			totalamount=totalamount-price;
		}
		else {
			System.out.println("ITEM CANT BE REMOVED");
		}
		
	}
	
	public int getCart() {
		return cartItems;
	}
	
	public double gettotal() {
		return totalamount;
	}

	

}

/* ENCAPSULATION EXAMPLE
 * Java- 1.Create a Java class named ShoppingCart using Encapsulation. Declare
 * private variables cartItems and totalAmount. Implement addItem(),
 * removeItem(), and getTotal() methods. Add and remove items by updating the
 * cart details appropriately. In the main() method, display the total amount
 * after performing the operations.
 */

