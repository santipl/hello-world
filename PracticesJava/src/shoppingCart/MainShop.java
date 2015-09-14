package shoppingCart;

import java.util.Scanner;

public class MainShop {

	public static void main(String[] args) {
		
		String name, clientID, password, shippingAdress, option;
		boolean exit = false;
		Scanner scanner = new Scanner(System.in);
		Product product = null;
		
		while (!exit){
			System.out.println("---*Welcome to The Shopping*---");
			System.out.println("---ENTER AN OPTION:");
			System.out.println("1.Create Client");
			System.out.println("2.Shop");
			System.out.println("3.New Product");
			System.out.println("9.Exit");
			option = scanner.nextLine();
			
			switch (option){
			case "1":
				System.out.println("Enter the name of the client: ");
				name = scanner.nextLine();
				System.out.print("Enter the clientID: ");
				clientID = scanner.nextLine();
				System.out.print("Enter the password: ");
				password = scanner.nextLine();
				System.out.print("Enter the shipping Adress: ");
				shippingAdress = scanner.nextLine();
				Client client = new Client(name, clientID, password, shippingAdress);
				client.showData();
				break;
			case "2":
				System.out.println("Choose your products");
				// call for shopping
				break;
			case "3":
				product.newProduct();
				break;
			case "9":
				System.out.println("Bye bye");
				exit=true;
				break;
			default:
				System.out.println("wrong option, try again please...");
				break;
			}
			 
		}
		
		
		scanner.close();
		
	}

}
