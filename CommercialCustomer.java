/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
public class CommercialCustomer extends Customer {
	private double creditRating;
	private String contactPerson;
	private String contactPersonPhone;

	/**
	 * 
	 */
	public CommercialCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param address
	 * @param phone
	 * @param account
	 */
	public CommercialCustomer(String name, String address, String phone, Account account, double creditRating,
			String contactPerson, String contactPersonPhone) {
		super(name, address, phone, account);
		this.creditRating = creditRating;
		this.contactPerson = contactPerson;
		this.contactPersonPhone = contactPersonPhone;
	}

	/**
	 * @return the creditRating
	 */
	public double getCreditRating() {
		return creditRating;
	}

	/**
	 * @param creditRating the creditRating to set
	 */
	public void setCreditRating(double creditRating) {
		this.creditRating = creditRating;
	}

	/**
	 * @return the contactPerson
	 */
	public String getContactPerson() {
		return contactPerson;
	}

	/**
	 * @param contactPerson the contactPerson to set
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	/**
	 * @return the contactPersonPhone
	 */
	public String getContactPersonPhone() {
		return contactPersonPhone;
	}

	/**
	 * @param contactPersonPhone the contactPersonPhone to set
	 */
	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}

}
