package exercises.one.shoppingCart;

public abstract class ShoppingCartBuilder {

	protected ShoppingCart shoppingCart;

	public void createNewCart() {
		shoppingCart = new ShoppingCart();
	}

	public ShoppingCart getCart() {
		return shoppingCart;
	}

	public abstract void buildCart();

	public abstract void buildCartID();

}
