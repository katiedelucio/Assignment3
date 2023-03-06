

/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
public class CheckingAccount extends Account {
private String checkStyle;
private double minimumBalance;
/**
 * 
 */
public CheckingAccount() {
	super();
}

public CheckingAccount(int accountNumber, double balance, String branch, String dateOpened,String checkStyle, double minimumBalance) {
	super(accountNumber, balance, branch, dateOpened);
	this.checkStyle = checkStyle;
	this.minimumBalance = minimumBalance;
}
/**
 * @return the checkStyle
 */
public String getCheckStyle() {
	return checkStyle;
}
/**
 * @param checkStyle the checkStyle to set
 */
public void setCheckStyle(String checkStyle) {
	this.checkStyle = checkStyle;
}
/**
 * @return the minimumBalance
 */
public double getMinimumBalance() {
	return minimumBalance;
}
/**
 * @param minimumBalance the minimumBalance to set
 */
public void setMinimumBalance(double minimumBalance) {
	this.minimumBalance = minimumBalance;
}

@Override
public String toString() {
	String output = super.toString()+ "\nCheck Syle: " + checkStyle + "\nMinimum Balance: " + minimumBalance;
	return output;
}


}
