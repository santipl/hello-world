package builderPattern;

public class House {
	
	private String material;
	private String color;
	private String floors;
	
	public String getMaterial() {
		return material;
	}
	public String getColor() {
		return color;
	}
	public String getFloors() {
		return floors;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFloors(String floors) {
		this.floors = floors;
	}
	
	@Override
	public String toString() {
		return ("[material= " + material + ", color= " + color + ", floors= " + floors + "]");
	}
	

}
