package exercises.one.one;

import java.util.Scanner;

public class Product {
	
	String name;
	String productID;
	double price;
	int stock;
	String description;
	Product product;
	Scanner input = new Scanner(System.in);
	
	protected Product(String name, String productID, double price, int stock, String description) {
		this.name = name;
		this.productID = productID;
		this.price = price;
		this.stock = stock;
		this.description = description;
	}

	public Product() {
		// TODO Auto-generated constructor stub
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
	
	protected Product newProduct(String name, String productID, double price, int stock, String description){
		Product product = new Product(name, description, price, stock, description);
		return product;
	}
	
	public Product createProduct(Product product){
		System.out.print("enter name of the product: ");
		this.name = input.nextLine();
		System.out.print("enter productID of the product: ");
		productID = input.nextLine();
		System.out.print("enter price of the product: ");
		price = input.nextDouble();
		System.out.print("enter stock of the product: ");
		stock = input.nextInt();
		System.out.print("enter description of the product: ");
		description = input.nextLine();
		product.newProduct(name, productID, price, stock, description);
		input.close();
		return product;
	} // end of createProduct

}
