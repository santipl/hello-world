package exercises.one.one;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

	ArrayList<Product> cart = new ArrayList<Product>();
	Product product;
	ShoppingCart shopCart;
	Scanner input = new Scanner(System.in);

	protected void doShopping(Client client, ArrayList<Product> catalogue) {
		product = catalogue.selectProduct(catalogue);
		shopCart.addProductToCart(cart, product);
	}

	protected ArrayList<Product> addProductToCart(ArrayList<Product> cart, Product product) {
		// add product to cart
		cart.add(product);
		return cart;
	}

	public double calculateSubTotal(ArrayList<Product> cart) {
		double subtotal = 0;
		// calculate the subtotal of the cart
		return subtotal;
	}

	protected boolean choosePayment() {
		System.out.println("choose type of payment /cash/credit/paypal");
		String type = input.nextLine();
		Payment payment = PaymentFactory.getPayment(type);
		Discounts discount = new Discounts();
		payment.payWith(calculateSubTotal(cart), discount.getDiscount(cart, type));
		return false;
	}

	protected Product selectProduct(ArrayList<Product> catalogue) {
		// select product
		return product;
	}

}
