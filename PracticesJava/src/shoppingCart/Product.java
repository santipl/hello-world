package shoppingCart;

public class Product {
	
	String name;
	String productID;
	double price;
	int stock;
	String description;
	
	protected Product(String name, String productID, double price, int stock, String description) {
		this.name = name;
		this.productID = productID;
		this.price = price;
		this.stock = stock;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getProductID() {
		return productID;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	protected Product newProduct(){
		Product product = new Product(description, description, price, stock, description);
		return product;
	}

}
