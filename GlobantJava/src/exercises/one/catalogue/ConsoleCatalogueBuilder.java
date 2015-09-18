package exercises.one.catalogue;

import java.util.Scanner;

import exercises.one.product.Product;

public class ConsoleCatalogueBuilder extends CatalogueBuilder {
	
	Scanner input = new Scanner(System.in);

	@Override
	public void buildCatalogue() {
		catalogue.setCatalogue(catalogue);
	}

	@Override
	public void buildCatalogueType() {
		System.out.println("Enter type of catalogue (suggested normal or offers)");
		catalogue.setType(input.nextLine());

	}

	@Override
	public void addProductInCatalogue(Catalogue catalogue) {
		Product prod = new Product();
		prod.
		
	}

	@Override
	public void deleteProductFromCatalogue(Catalogue catalogue) {
		// TODO Auto-generated method stub
		
	}

}
