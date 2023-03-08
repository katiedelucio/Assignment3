/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
public class Cars {
private String make;
private String model;
private int year;
private String VINnumber;
private CarOwners carOwner;
/**
 * 
 */
public Cars() {
	super();
}
/**
 * @param make
 * @param model
 * @param year
 * @param vINnumber
 * @param carOwner
 */
public Cars(String make, String model, int year, String VINnumber, CarOwners carOwner) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
	this.VINnumber = VINnumber;
	this.carOwner = carOwner;
}
/**
 * @return the make
 */
public String getMake() {
	return make;
}
/**
 * @param make the make to set
 */
public void setMake(String make) {
	this.make = make;
}
/**
 * @return the model
 */
public String getModel() {
	return model;
}
/**
 * @param model the model to set
 */
public void setModel(String model) {
	this.model = model;
}
/**
 * @return the year
 */
public int getYear() {
	return year;
}
/**
 * @param year the year to set
 */
public void setYear(int year) {
	this.year = year;
}
/**
 * @return the VINnumber
 */
public String getVINnumber() {
	return VINnumber;
}
/**
 * @param vINnumber the vINnumber to set
 */
public void setVINnumber(String VINnumber) {
	this.VINnumber = VINnumber;
}
/**
 * @return the carOwner
 */
public CarOwners getCarOwner() {
	return carOwner;
}
/**
 * @param carOwner the carOwner to set
 */
public void setCarOwner(CarOwners carOwner) {
	this.carOwner = carOwner;
}
@Override
public String toString() {
	String output = "Car: \nmake: " + make + "\nmodel: " +model+ "\nyear: " +year+ "\nVIN number: " +VINnumber+ "\n" +carOwner;
	return output;

}
}
