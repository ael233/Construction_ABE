
public class Business extends Building{
	protected int numRentableUnits;

	public Business() {
		super();
		numRentableUnits = 0;
	}//end empty-argument constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw
	
	public String displayData() { //I'm instantiating a new variable that will use but override the superclass variable
		StringBuilder sb = new StringBuilder(super.displayData()); //this calls the superclass displayData method
		sb.append("Number of rentable units: " + numRentableUnits + "\n"); //this adds to what the superclass method already does
		
		return sb.toString();
	}//end displayData

	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumREntableUnits

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + ", displayData()=" + displayData() + ", getNumRentableUnits()="
				+ getNumRentableUnits() + ", getProjectName()=" + getProjectName() + ", getCompleteAddress()="
				+ getCompleteAddress() + ", getTotalSquareFeet()=" + getTotalSquareFeet() + ", getOccupancyGroup()="
				+ getOccupancyGroup() + ", getSubgroup()=" + getSubgroup() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}//end class
