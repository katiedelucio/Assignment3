/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
public class Customer {
private String name;
private String address;
private String phone;
private Account account;
/**
 * 
 */
public Customer() {
	super();
}

/**
 * @param name
 * @param address
 * @param phone
 * @param account
 */
public Customer(String name, String address, String phone, Account account) {
	super();
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.account = account;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return the phone
 */
public String getPhone() {
	return phone;
}
/**
 * @param phone the phone to set
 */
public void setPhone(String phone) {
	this.phone = phone;
}
/**
 * @return the account
 */
public Account getAccount() {
	return account;
}
/**
 * @param account the account to set
 */
public void setAccount(Account account) {
	this.account = account;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", address=" + address + ", phone=" + phone + ", account=" + account + "]";
}



}
