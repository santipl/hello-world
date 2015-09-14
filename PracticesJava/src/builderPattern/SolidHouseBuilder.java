package builderPattern;

public class SolidHouseBuilder extends HouseBuilder {

	@Override
	public void buildMaterial() {
		house.setMaterial("concrete");
	}

	@Override
	public void buildColor() {
		house.setColor("white");		
	}

	@Override
	public void buildFloor() {
		house.setFloors("2");		
	}

	@Override
	public String toString() {
		return "Solid House style " + house;
	}
}
