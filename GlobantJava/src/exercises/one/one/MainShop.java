package exercises.one.one;

import java.util.ArrayList;

public class MainShop {

	public static void main(String[] args) {

		Client client = new Client();
		ArrayList<Product> catalogue = new ArrayList<Product>();
		Product product = new Product();
		ShoppingCart shopcart = new ShoppingCart();

//		product.createProduct(product);
//		catalogue.add(product);
//		shopcart.doShopping(client, catalogue);
		
		shopcart.choosePayment();
		

	}

}
