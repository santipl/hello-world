package exercises.one.one;

public class Paypal implements Payment {

	String email;
	String password;

	public boolean validatePaypal(String email, String password) {
		// validation method of Paypal
		return false;
	}

	@Override
	public double payWith(double subtotal, double discount) {
		double total = 0;
		total = subtotal - discount;
		return total;
	}

}
