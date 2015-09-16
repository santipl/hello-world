package exercises.one.one;

public class Cash implements Payment {

	@Override
	public double payWith(double subtotal, double discount) {
		double total = 0;
		total = subtotal - discount;
		return total;
	}

}
