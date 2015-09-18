package exercises.one.payment;

import exercises.one.client.Client;
import exercises.one.shoppingCart.ShoppingCart;

public interface Payment {
	
	public void payWith(ShoppingCart cart, Client client);
	
}
