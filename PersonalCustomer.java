/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
public class PersonalCustomer extends Customer{
private String homePhone;
private String workPhone;
/**
 * 
 */
public PersonalCustomer() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param name
 * @param address
 * @param phone
 * @param account
 */
public PersonalCustomer(String name, String address, String phone, Account account, String homePhone, String workPhone) {
	super(name, address, phone, account);
	this.homePhone = homePhone;
	this.workPhone = workPhone;
}
/**
 * @return the homePhone
 */
public String getHomePhone() {
	return homePhone;
}
/**
 * @param homePhone the homePhone to set
 */
public void setHomePhone(String homePhone) {
	this.homePhone = homePhone;
}
/**
 * @return the workPhone
 */
public String getWorkPhone() {
	return workPhone;
}
/**
 * @param workPhone the workPhone to set
 */
public void setWorkPhone(String workPhone) {
	this.workPhone = workPhone;
}





}
