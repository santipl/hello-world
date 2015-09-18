package exercises.one.payment;

import java.util.Scanner;

import exercises.one.client.Client;
import exercises.one.shoppingCart.ShoppingCart;

public class PaymentFactory {

	public static Payment getPayment(String paymentType) {

		Scanner input = new Scanner(System.in);
		System.out.println("choose type of payment /cash/credit/paypal");
		String type = input.nextLine();
	
		switch (type) {
		case "paypal":
			System.out.println("paypal payment");
			return new Paypal();
			break;
		case "credit":
			System.out.println("credit payment");
			return new CreditCard();
			break;
		case "cash":
			System.out.println("cash payment");
			return new Cash();
			break;
		default:
			System.out.println("wrong option, try again please...");
			break;
		}

		input.close();

	}
	
	

}
