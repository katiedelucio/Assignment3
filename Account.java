

/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
public class Account {
private int accountNumber;
private double balance;
private String branch;
private String dateOpened;
/**
 * 
 */
public Account() {
	super();
}
/**
 * @param accountNumber
 * @param balance
 * @param dateOpened
 */
public Account(int accountNumber, double balance, String branch, String dateOpened) {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.branch = branch;
	this.dateOpened = dateOpened;
}
/**
 * @return the accountNumber
 */
public int getAccountNumber() {
	return accountNumber;
}
/**
 * @param accountNumber the accountNumber to set
 */
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
/**
 * @return the balance
 */
public double getBalance() {
	return balance;
}
/**
 * @param balance the balance to set
 */
public void setBalance(double balance) {
	this.balance = balance;
}


/**
 * @return the branch
 */
public String getBranch() {
	return branch;
}
/**
 * @param branch the branch to set
 */
public void setBranch(String branch) {
	this.branch = branch;
}


/**
 * @return the dateOpened
 */
public String getDateOpened() {
	return dateOpened;
}
/**
 * @param dateOpened the dateOpened to set
 */
public void setDateOpened(String dateOpened) {
	this.dateOpened = dateOpened;
}
public void makeDeposit(double x) {
this.balance = this.balance + x;	
}

public void makeWithdrawl(double y) {
this.balance = this.balance - y;	
}
@Override
public String toString() {
	String output = "Account number: " + accountNumber + "\nBalance: " + balance + "\nBank Branch: " + branch + "\nDate Account Opened: "
+ dateOpened;	
	return output;
}

}
