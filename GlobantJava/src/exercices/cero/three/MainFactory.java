package exercices.cero.three;

import java.util.Scanner;

public class MainFactory {

	public static void main(String[] args) {
		
		String input;
		BuildingFactory hospital = new BuildingFactory();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Choose wich kind of Hospital would like: ");
		input = scanner.nextLine();
		hospital.getBuildingInstance(input);
		Building h1 = hospital.getBuildingInstance(input);
		System.out.println("type of Hospital made: " + h1.makeBuilding());
		
		scanner.close();

	}

}
