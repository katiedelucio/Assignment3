/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
import java.util.ArrayList;
import java.util.Scanner;
public class UseCars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//arraylist to store cars
				ArrayList<Cars> cars = new ArrayList<>();
				//cars I created
				SportsCars sc5 = new SportsCars("Chevy", "Camero", 2009, "ABC123", newOwners(), 9000);
				SedanCars s6 = new SedanCars("Ford", "Fiesta", 2015, "XYZ123", newOwners(), 4, 2);
				Cars c7 = new Cars("Toyota", "Tundra", 2011, "BNM567", newOwners());
				cars.add(sc5);
				cars.add(s6);
				cars.add(c7);
			//search by VIN
				displayVIN("ABC123", cars);
		//methods to create cars based on requested info
			newSportsCar(cars);
			newSedanCar(cars);
		
		//prints all cars in ArrayList		
		System.out.println("Here is a list of all the cars: ");
		System.out.println(cars);
	
	}
public static CarOwners newOwners() {//method to request info and returns owner
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the name of the car owner: ");
	String name = input.nextLine();
	System.out.print("Please enter the address of the car owner: ");
	String address = input.nextLine();
	CarOwners c1 = new CarOwners(name, address);
	return c1;
}
//method for sports car
public static SportsCars newSportsCar(ArrayList<Cars>cars) {
	Scanner input = new Scanner(System.in);
	//String make, String model, int year, String VINnumber, CarOwners carOwner, int raceStats
	System.out.print("Please enter make of sports car: ");
	String make = input.nextLine();
	System.out.print("Please enter model of sports car: ");
	String model = input.nextLine();
	System.out.print("Please enter year of car: ");
	int year = input.nextInt();
	System.out.print("Please enter VIN of car: ");
	input.nextLine();
	String VINnumber = input.nextLine();
	CarOwners carOwner = newOwners();
	System.out.print("Please enter race stats of car: ");
	int raceStats = input.nextInt();
	SportsCars sc1 = new SportsCars(make, model, year, VINnumber, carOwner, raceStats);
	cars.add(sc1);
	return sc1;
	
}
//method for sedan car
public static SedanCars newSedanCar(ArrayList<Cars>cars) {
	Scanner input = new Scanner(System.in);
	//String make, String model, int year, String VINnumber, CarOwners carOwner, int numberOfDoors, int trunkSize
	System.out.print("Please enter make of sedan car: ");
	String make = input.nextLine();
	System.out.print("Please enter model of sedan car: ");
	String model = input.nextLine();
	System.out.print("Please enter year of car: ");
	int year = input.nextInt();
	System.out.print("Please enter VIN of car: ");
	input.nextLine();
	String VINnumber = input.nextLine();
	CarOwners carOwner = newOwners();
	System.out.print("Please enter number of doors on car: ");
	int numberOfDoors = input.nextInt();
	System.out.print("Please enter trunk size on car: ");
	int trunkSize = input.nextInt();
	SedanCars sedc1 = new SedanCars(make, model, year, VINnumber, carOwner, numberOfDoors, trunkSize);
	cars.add(sedc1);
	return sedc1;
}
public static void displayVIN(String VIN, ArrayList<Cars> cars) {
	
	for (Cars c: cars) {
		if (VIN == c.getVINnumber())
			System.out.println("The info on car with VIN " + c.getVINnumber()+ " is: " +c);
	}
}
}
