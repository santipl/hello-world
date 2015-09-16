package exercises.one.one;

import java.util.ArrayList;

public class Catalogue {

	Product product;

	protected ArrayList<Product> catalogue;

	protected Catalogue(ArrayList<Product> catalogue) {
		catalogue = new ArrayList<Product>();
	}

	protected ArrayList<Product> addProductToColl(ArrayList<Product> catalogue, Product product) {
		catalogue.add(product);
		return catalogue;
	} // end of addProductToColl

}
