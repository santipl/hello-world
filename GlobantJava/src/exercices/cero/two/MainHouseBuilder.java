package exercices.cero.two;

public class MainHouseBuilder {

	public static void main(String[] args) {
		
		HouseBuilder houseBuilder = new WoodHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.construceHouse();
		House house = houseDirector.getHouse();
		System.out.println("the house built is: " + house);
		
		houseBuilder = new SolidHouseBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.construceHouse();
		house = houseDirector.getHouse();
		System.out.println("the house built is: " + house);
		

	}

}
