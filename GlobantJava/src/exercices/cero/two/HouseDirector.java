package exercices.cero.two;

public class HouseDirector {
	
	private HouseBuilder houseBuilder;
	
	public void setHouseBuilder(HouseBuilder hb) {
		houseBuilder = hb;
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}

	public void constructHouse() {
		houseBuilder.createNewHouse();
		houseBuilder.buildMaterial();
		houseBuilder.buildColor();
		houseBuilder.buildFloor();
	}
}
