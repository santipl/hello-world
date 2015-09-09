package exercices.cero.two;

public class WoodHouseBuilder implements HouseBuilder {
	
	private House house;

	public WoodHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildMaterial() {
		house.setMaterial("wood");		
	}

	@Override
	public void buildColor() {
		house.setColor("natural");
		
	}

	@Override
	public void buildFloors() {
		house.setFloors("1");
		
	}

	@Override
	public House getHouse() {
		return house;
	}
	
	

	
	

}
