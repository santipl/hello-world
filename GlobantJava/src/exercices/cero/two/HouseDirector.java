package exercices.cero.two;

public class HouseDirector {
	
	private HouseBuilder houseBuilder = null;
	
	public HouseDirector(HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
	}
	
	public void constructHouse(){
		houseBuilder.buildMaterial();
		houseBuilder.buildColor();
		houseBuilder.buildFloors();
	}
	
	public House getHouse(){
		return houseBuilder.getHouse();
	}

}
