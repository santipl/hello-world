package exercises.one.payment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

import exercises.one.client.Client;
import exercises.one.product.Product;
import exercises.one.shoppingCart.ShoppingCart;

public class Transaction {

	private String clientName;
	private String clientID;
	private Date date;
	private double totalPayed;
	private ArrayList<Product> shoppingList;

	protected Transaction() {
	}

	public void newTransaction(ArrayList<Product> cart, Client client, double total) {
		this.clientName = client.getName();
		this.clientID = client.getClientID();
		this.totalPayed = total;
		this.shoppingList = cart.getCart();

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		// get current date time with Date()
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		this.date = date;
	}
	
	public Transaction getTransaction(ArrayList<Product> cart, Client client, double total){
		Transaction t = new Transaction();
		t.newTransaction(cart, client, total);
		return t;
	}

}
