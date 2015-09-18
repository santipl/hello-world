package exercises.one;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import exercises.one.payment.Transaction;
import exercises.one.product.Product;
import exercises.one.client.Client;
import exercises.one.client.ClientBuilder;
import exercises.one.client.ClientDirector;
import exercises.one.client.ConsoleClientBuilder;
import exercises.one.product.ConsoleProductBuilder;
import exercises.one.product.ProductBuilder;
import exercises.one.product.ProductDirector;
import exercises.one.shoppingCart.ConsoleCartBuilder;
import exercises.one.shoppingCart.ShoppingCart;
import exercises.one.shoppingCart.ShoppingCartBuilder;
import exercises.one.shoppingCart.ShoppingCartDirector;

public class MainShop {

	public static void main(String[] args) {

		ClientDirector clientDirector = new ClientDirector();
		ClientBuilder cb = new ConsoleClientBuilder();
		clientDirector.setClientBuilder(cb);
		clientDirector.constructClient();
		Client client = clientDirector.getClient();
		System.out.println(client);

		ProductDirector productDirector = new ProductDirector();
		ProductBuilder prod1 = new ConsoleProductBuilder();
		productDirector.setProductBuilder(prod1);
		productDirector.constructProduct();
		Product product = productDirector.getProduct();
		System.out.println(product);

		/*
		 * ShoppingCartDirector cartDirector = new ShoppingCartDirector();
		 * ShoppingCartBuilder cart1 = new ConsoleCartBuilder();
		 * cartDirector.setShoppingCartBuilder(cart1);
		 * cartDirector.constructCart(); ShoppingCart cart =
		 * cartDirector.getCart(); System.out.println(cart);
		 */

	
		

	}

}
