package exercices.cero.two;

public class House {
	
	private String material;
	private String color;
	private String floors;
	
	public synchronized String getMaterial() {
		return material;
	}
	public synchronized void setMaterial(String material) {
		this.material = material;
	}
	public synchronized String getColor() {
		return color;
	}
	public synchronized void setColor(String color) {
		this.color = color;
	}
	public synchronized String getFloors() {
		return floors;
	}
	public synchronized void setFloors(String floors) {
		this.floors = floors;
	}
	@Override
	public String toString() {
		return "House [material= " + material + ", color= " + color + ", floors= " + floors + "]";
	}

}
