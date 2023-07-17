
public class Residential extends Building{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end empty-argument constructor

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//end preferred constructor
	
		
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw
	
	public String displayData() { //I'm instantiating a new variable that will use but override the superclass variable
		StringBuilder sb = new StringBuilder(super.displayData()); //this calls the superclass displayData method
		sb.append("Number of bedrooms: " + numBedrooms + "\n"); //this adds to what the superclass method already does
		sb.append("Number of bathrooms: " + numBathrooms + "\n"); //this adds to what the superclass method already does
		sb.append("Laundryroom: " + laundryRoom + "\n"); //this adds to what the superclass method already does
		
		return sb.toString();
	}//end displayData

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + ", getNumBedrooms()=" + getNumBedrooms() + ", getNumBathrooms()=" + getNumBathrooms()
				+ ", isLaundryRoom()=" + isLaundryRoom() + ", displayData()=" + displayData() + ", getProjectName()="
				+ getProjectName() + ", getCompleteAddress()=" + getCompleteAddress() + ", getTotalSquareFeet()="
				+ getTotalSquareFeet() + ", getOccupancyGroup()=" + getOccupancyGroup() + ", getSubgroup()="
				+ getSubgroup() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}//end class
