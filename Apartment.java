
public class Apartment extends Residential{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment(){
		super();
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	}//end empty-argument constructor

	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//end preferred constructor


	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable

	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw
	
	public String displayData() { //I'm instantiating a new variable that will use but override the superclass variable
		StringBuilder sb = new StringBuilder(super.displayData()); //this calls the superclass displayData method
		sb.append("Number of rentable units: " + numRentableUnits + "\n"); //this adds to what the superclass method already does
		sb.append("Average unit size: " + avgUnitSize + "\n"); //this adds to what the superclass method already does
		sb.append("Is parking availalbe: " + parkingAvailable + "\n"); //this adds to what the superclass method already does
		
		return sb.toString();
	}//end displayData

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + ", getNumRentableUnits()=" + getNumRentableUnits() + ", getAvgUnitSize()="
				+ getAvgUnitSize() + ", isParkingAvailable()=" + isParkingAvailable() + ", displayData()="
				+ displayData() + ", getNumBedrooms()=" + getNumBedrooms() + ", getNumBathrooms()=" + getNumBathrooms()
				+ ", isLaundryRoom()=" + isLaundryRoom() + ", toString()=" + super.toString() + ", getProjectName()="
				+ getProjectName() + ", getCompleteAddress()=" + getCompleteAddress() + ", getTotalSquareFeet()="
				+ getTotalSquareFeet() + ", getOccupancyGroup()=" + getOccupancyGroup() + ", getSubgroup()="
				+ getSubgroup() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}//end class
