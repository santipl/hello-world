package exercises.one.one;

import java.util.ArrayList;

public class Discounts {

	int discountCreditCard = 10; // in percentage
	int discountCash = 90; // in percentage

	public double getDiscount(ArrayList<Product> cart, String type) {
		// double discount = 0;
		if (type.equalsIgnoreCase("cash")) {
			return getExpensive(cart) * discountCash / 100;
		} else if (type.equalsIgnoreCase("paypal")) {
			return getCheapest(cart);
		} else if (type.equalsIgnoreCase("credit")) {
			ShoppingCart shopCart = new ShoppingCart();
			return shopCart.calculateSubTotal(cart) * discountCreditCard / 100;
		} else {
			System.out.println("no discount");
			return 0;
		}
	}

	public double getExpensive(ArrayList<Product> cart) {
		double expensive = 0;
		// look for the most expensive
		return expensive;
	}

	public double getCheapest(ArrayList<Product> cart) {
		double cheapest = 0;
		// find the cheapest
		return cheapest; // return the cheapest value
	}

}
