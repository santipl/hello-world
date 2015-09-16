package exercises.one.one;

public class CreditCard implements Payment {

	private String userName;
	private int cardNumber;

	public boolean validateCreditCard(String userName, int cardNumber) {
		// validation method of credit card
		if (true) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public double payWith(double subtotal, double discount) {
		double total = 0;
		total = total - (discount * subtotal / 100);
		return total;
	}

}
