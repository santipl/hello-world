package exercises.one.one;

public class PaymentFactory {

	public static Payment getPayment(String paymentType) {
		if (paymentType.equalsIgnoreCase("paypal")) {
			System.out.println("paypal payment");
			return new Paypal();
		} else if (paymentType.equalsIgnoreCase("credit")) {
			System.out.println("credit payment");
			return new CreditCard();
		} else if (paymentType.equalsIgnoreCase("cash")) {
			System.out.println("cash payment");
			return new Cash();
		}
		return null;

	}

}
