package builderPattern;

import java.util.Scanner;

public class MainBuilder {

	public static void main(String[] args) {
		
		String type;
		Scanner scanner = new Scanner(System.in);
		HouseDirector houseDirector = new HouseDirector();
		
		System.out.print("Choose wich type of House would you like (wood/solid): ");
		type = scanner.nextLine();
		if (type.equals("wood")){
			HouseBuilder wood_houseBuilder = new WoodHouseBuilder();
			houseDirector.setHouseBuilder(wood_houseBuilder);
			houseDirector.constructHouse();
			House house = houseDirector.getHouse();
			System.out.println("the house built is: " + wood_houseBuilder);
		} else {
			HouseBuilder solid_houseBuilder = new SolidHouseBuilder();
			houseDirector.setHouseBuilder(solid_houseBuilder);
			houseDirector.constructHouse();
			House house = houseDirector.getHouse();
			System.out.println("the house built is: " + solid_houseBuilder);
		}
		
		scanner.close();
		
	}

}
