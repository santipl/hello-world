package shoppingCart;

public class Client {
	
	String name;
	String clientID;
	String password;
	String shippingAdress;
	
	protected Client(String name, String clientID, String password, String shippingAdress) {
		super();
		this.name = name;
		this.clientID = clientID;
		this.password = password;
		this.shippingAdress = shippingAdress;
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
	
	protected void showData(){
		name = getName();
		clientID = getClientID();
		shippingAdress = getShippingAdress();
		System.out.println("Name: " + name + " - ClientID: " + clientID + " - Shipping Adress: " + shippingAdress);
	}

}
