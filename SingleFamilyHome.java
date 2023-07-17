
public class SingleFamilyHome extends Residential{
	private boolean garage;
	
	public SingleFamilyHome() {
		super();
		garage = false;
	}//end empty-argument constructor

	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
	}//end preferred constructor

	public boolean isGarage() {
		return garage;
	}//end isGarage

	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw
	
	public String displayData() { //I'm instantiating a new variable that will use but override the superclass variable
		StringBuilder sb = new StringBuilder(super.displayData()); //this calls the superclass displayData method
		sb.append("Is there a garage: " + garage + "\n"); //this adds to what the superclass method already does
		
		return sb.toString();
	}//end displayData

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + ", isGarage()=" + isGarage() + ", displayData()=" + displayData()
				+ ", getNumBedrooms()=" + getNumBedrooms() + ", getNumBathrooms()=" + getNumBathrooms()
				+ ", isLaundryRoom()=" + isLaundryRoom() + ", toString()=" + super.toString() + ", getProjectName()="
				+ getProjectName() + ", getCompleteAddress()=" + getCompleteAddress() + ", getTotalSquareFeet()="
				+ getTotalSquareFeet() + ", getOccupancyGroup()=" + getOccupancyGroup() + ", getSubgroup()="
				+ getSubgroup() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
}//end class
