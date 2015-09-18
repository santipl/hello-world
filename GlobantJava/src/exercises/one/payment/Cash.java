package exercises.one.payment;

import exercises.one.Counter;
import exercises.one.client.Client;
import exercises.one.shoppingCart.ShoppingCart;

public class Cash implements Payment {

	public static double cashDiscount(ShoppingCart cart) {
		double discount = cart.expensiveProduct().getPrice() * 0.9; // the Manager should have the option to change the %
		return discount;
	}

	@Override
	public void payWith(ShoppingCart cart, Client client) {
		double subtotal = cart.totalPrice();
		double discount = cashDiscount(cart);
		double total = subtotal - discount;

		System.out.println("Payment code " + Counter.getTransactionCount());
		Counter.increaseTransactionCount();
		System.out.println("Subtotal: $" + subtotal + "\n" + "Discount: $" + discount 
				+ " 90% of discount on the most expensive product.\n"
				+ "Total: $" + total + " has been paid with Cash.");
		
		// add Transaction
		// add send mail to Manager
	}
}
