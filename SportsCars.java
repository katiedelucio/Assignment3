/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
public class SportsCars extends Cars {
	private int raceStats;

	/**
	 * 
	 */
	public SportsCars() {
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
	public SportsCars(String make, String model, int year, String VINnumber, CarOwners carOwner, int raceStats) {
		super(make, model, year, VINnumber, carOwner);
		this.raceStats = raceStats;
	}

	/**
	 * @return the raceStats
	 */
	public int getRaceStats() {
		return raceStats;
	}

	/**
	 * @param raceStats the raceStats to set
	 */
	public void setRaceStats(int raceStats) {
		this.raceStats = raceStats;
	}

	@Override
	public String toString() {
		String output = "Sports Car:\nrace stats: " +raceStats+ "\n" +super.toString();
		return output;
	}
	

}
