package exercises.one.shoppingCart;

import exercises.one.Counter;

public class ConsoleCartBuilder extends ShoppingCartBuilder {

	@Override
	public void buildCart() {
		shoppingCart.setCart(cart);

	}

	@Override
	public void buildCartID() {
		shoppingCart.setCartID(Counter.getCartID());

	}

}
