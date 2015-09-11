package exercices.cero.two;

public class WoodHouseBuilder extends HouseBuilder {

	@Override
	public void buildMaterial() {
		house.setMaterial("wood");
	}

	@Override
	public void buildColor() {
		house.setColor("natural");		
	}

	@Override
	public void buildFloor() {
		house.setFloors("1");		
	}

	@Override
	public String toString() {
		return "Wood House style " + house;
	}
	
}
