package exercices.cero.two;

public abstract class HouseBuilder {
	
	protected House house;
	
	public House getHouse(){
		return house;
	}
	
	public void createNewHouse() {
		house = new House();
	}

	public abstract void buildMaterial();

	public abstract void buildColor();

	public abstract void buildFloor();

}
