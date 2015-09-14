package factoryPattern;

public class BuildingFactory {
	
	public Building getBuildingInstance(String type){
		if ("kids".equals(type)){
			return new KidsHospital();				
		} else {
			return new CommonHospital();
		}
			
	}

}
