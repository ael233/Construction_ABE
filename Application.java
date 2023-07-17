
public class Application {
	public static void main(String[] args) {
		Building bldg1 = new Building("Big Building", "100 Building Street", 60000.0, "Mercantile", "M-1");
		System.out.println(bldg1.displayData());
		
		Business workplace = new Business("Craft Store", "123 Sesame Street", 25000, "Business", "Group B", 1);
		System.out.println(workplace.displayData());
		
		Residential residence = new Residential("House", "230 Jefferson", 1600, "Residential", "R-2", 4, 3, true);
		System.out.println(residence.displayData());
		
		Mall Greenbriar = new Mall("Greenbriar Mall", "400 South", 500000, "Mercantile", "M", 45, 32, 1200.0, 500);
		System.out.println(Greenbriar.displayData());
		
		Apartment Glenmary = new Apartment("Glenmary Apartments", "4000 Bardstown Road", 800000, "Residential", "R-3", 400, 200, true, 100, 1500.0, true);
		System.out.println(Glenmary.displayData());
		
		SingleFamilyHome bleemel = new SingleFamilyHome("Adam's house", "300 Main", 1500.00, "Residential", "R-1", 2, 1, true, false);
		System.out.println(bleemel.displayData());
		
		//I believe the above tests every object in this project.
		
	}//end main
}//end class
