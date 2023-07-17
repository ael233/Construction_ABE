
public class Mall extends Business{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall(){
		super();
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	}//end empty-argument constructor

	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}//end preferred constructor

	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits

	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces

	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw
	
	public String displayData() { //I'm instantiating a new variable that will use but override the superclass variable
		StringBuilder sb = new StringBuilder(super.displayData()); //this calls the superclass displayData method
		sb.append("Number of rented units: " + numRentedUnits + "\n"); //this adds to what the superclass method already does
		sb.append("Median unit size: " + medianUnitSize + "\n"); //this adds to what the superclass method already does
		sb.append("Number of parking spaces: " + numParkingSpaces + "\n"); //this adds to what the superclass method already does
		
		return sb.toString();
	}//end displayData

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + ", getNumRentedUnits()=" + getNumRentedUnits()
				+ ", getMedianUnitSize()=" + getMedianUnitSize() + ", getNumParkingSpaces()=" + getNumParkingSpaces()
				+ ", displayData()=" + displayData() + ", getNumRentableUnits()=" + getNumRentableUnits()
				+ ", toString()=" + super.toString() + ", getProjectName()=" + getProjectName()
				+ ", getCompleteAddress()=" + getCompleteAddress() + ", getTotalSquareFeet()=" + getTotalSquareFeet()
				+ ", getOccupancyGroup()=" + getOccupancyGroup() + ", getSubgroup()=" + getSubgroup() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}//end class
