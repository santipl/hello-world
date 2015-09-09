package exercices.cero.two;

public class SolidHouseBuilder implements HouseBuilder {
	
	private House house;

	public SolidHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildMaterial() {
		house.setMaterial("concrete");		
	}

	@Override
	public void buildColor() {
		house.setColor("white");
		
	}

	@Override
	public void buildFloors() {
		house.setFloors("2");
		
	}

	@Override
	public House getHouse() {
		return house;
	}
	
	

}
