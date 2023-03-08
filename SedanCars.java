/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
public class SedanCars extends Cars {
	private int numberOfDoors;
	private int trunkSize;
	/**
	 * 
	 */
	public SedanCars() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param make
	 * @param model
	 * @param year
	 * @param vINnumber
	 * @param carOwner
	 */
	public SedanCars(String make, String model, int year, String VINnumber, CarOwners carOwner, int numberOfDoors, int trunkSize) {
		super(make, model, year, VINnumber, carOwner);
		this.numberOfDoors = numberOfDoors;
		this.trunkSize = trunkSize;
		
	}
	/**
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	/**
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	/**
	 * @return the trunkSize
	 */
	public int getTrunkSize() {
		return trunkSize;
	}
	/**
	 * @param trunkSize the trunkSize to set
	 */
	public void setTrunkSize(int trunkSize) {
		this.trunkSize = trunkSize;
	}
	@Override
	public String toString() {
		String output = "Sedan Car:\nnumber of doors: " +numberOfDoors+ "\ntrunk size: " + trunkSize + "\n" +super.toString();
		return output;
	}

	
	
}
