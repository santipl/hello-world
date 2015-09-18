package exercises.one.catalogue;

public abstract class CatalogueBuilder {

	protected Catalogue catalogue;

	public void createNewCatalogue() {
		catalogue = new Catalogue();
	}

	public Catalogue getCatalogue() {
		return catalogue;
	}

	public abstract void buildCatalogue();

	public abstract void buildCatalogueType();
	
	public abstract void addProductInCatalogue (Catalogue catalogue);
	
	public abstract void deleteProductFromCatalogue(Catalogue catalogue);

}
