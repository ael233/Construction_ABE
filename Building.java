
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0;
		occupancyGroup = "";
		subgroup = "";
	}//end empty-argument constructor
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//end preferred constructor

	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw
	
	public String displayData() {
		StringBuilder sb = new StringBuilder("Information:\n");
		sb.append("Project name: " + projectName + "\n");
		sb.append("Complete address: " + completeAddress + "\n");
		sb.append("Total square feet: " + totalSquareFeet + "\n");
		sb.append("Occupancy group: " + occupancyGroup + "\n");
		sb.append("Subgroup: " + subgroup + "\n");
		
		return sb.toString();
	}//end displayData

	public String getProjectName() {
		return projectName;
	}//end getProjectName

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end setSubgroup

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", displayData()="
				+ displayData() + ", getProjectName()=" + getProjectName() + ", getCompleteAddress()="
				+ getCompleteAddress() + ", getTotalSquareFeet()=" + getTotalSquareFeet() + ", getOccupancyGroup()="
				+ getOccupancyGroup() + ", getSubgroup()=" + getSubgroup() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}//end class
