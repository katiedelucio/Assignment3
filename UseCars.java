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
		System.out.println(newSportsCar());
		System.out.println(newSedanCar());
		
	
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
public static SportsCars newSportsCar() {
	Scanner input = new Scanner(System.in);
	//String make, String model, int year, String VINnumber, CarOwners carOwner, int raceStats
	System.out.print("Please enter make of car: ");
	String make = input.nextLine();
	System.out.print("Please enter model of car: ");
	String model = input.nextLine();
	System.out.print("Please enter year of car: ");
	int year = input.nextInt();
	System.out.print("Please enter VIN of car: ");
	String VINnumber = input.nextLine();
	input.nextLine();
	CarOwners carOwner = newOwners();
	System.out.print("Please enter race stats of car: ");
	int raceStats = input.nextInt();
	SportsCars sc1 = new SportsCars(make, model, year, VINnumber, carOwner, raceStats);
	return sc1;
}
//method for sedan car
public static SedanCars newSedanCar() {
	Scanner input = new Scanner(System.in);
	//String make, String model, int year, String VINnumber, CarOwners carOwner, int numberOfDoors, int trunkSize
	System.out.print("Please enter make of car: ");
	String make = input.nextLine();
	System.out.print("Please enter model of car: ");
	String model = input.nextLine();
	System.out.print("Please enter year of car: ");
	int year = input.nextInt();
	System.out.print("Please enter VIN of car: ");
	String VINnumber = input.nextLine();
	input.nextLine();
	CarOwners carOwner = newOwners();
	System.out.print("Please enter number of doors on car: ");
	int numberOfDoors = input.nextInt();
	System.out.print("Please enter trunk size on car: ");
	int trunkSize = input.nextInt();
	SedanCars sedc1 = new SedanCars(make, model, year, VINnumber, carOwner, numberOfDoors, trunkSize);
	return sedc1;
}
//method to display info by provided VIN
}
