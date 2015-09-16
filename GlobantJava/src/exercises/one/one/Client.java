package exercises.one.one;

import java.util.Scanner;

import shoppingCart.Product;

public class Client {

	String name;
	String clientID;
	String password;
	String shippingAdress;
	Scanner input = new Scanner(System.in);

	protected Client(String name, String clientID, String password, String shippingAdress) {
		super();
		this.name = name;
		this.clientID = clientID;
		this.password = password;
		this.shippingAdress = shippingAdress;
	}

	protected Client() {
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getClientID() {
		return clientID;
	}

	private void setClientID(String clientID) {
		this.clientID = clientID;
	}

	private String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private String getShippingAdress() {
		return shippingAdress;
	}

	private void setShippingAdress(String shippingAdress) {
		this.shippingAdress = shippingAdress;
	}

	protected void showData() {
		name = getName();
		clientID = getClientID();
		shippingAdress = getShippingAdress();
		System.out.println("Name: " + name + " - ClientID: " + clientID + " - Shipping Adress: " + shippingAdress);
	}

	protected Client newClient(String name, String clientID, String password, String shippingAdress) {
		Client client = new Client(name, clientID, password, shippingAdress);
		return client;
	}

	protected Client createClient(Client client) {
		System.out.print("enter name of the client: ");
		this.name = input.nextLine();
		System.out.print("enter clientID of the client: ");
		this.clientID = input.nextLine();
		System.out.print("enter password of the client: ");
		this.password = input.nextLine();
		System.out.print("enter shipping adress of the client: ");
		this.shippingAdress = input.nextLine();
		client.newClient(name, clientID, password, shippingAdress);
		input.close();
		return client;
	} // end of createClient

}
