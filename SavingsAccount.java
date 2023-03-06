

/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
public class SavingsAccount extends Account {
private double interestRate;


/**
 * 
 */
public SavingsAccount() {
	super();
}


public SavingsAccount(int accountNumber, double balance, String branch, String dateOpened, double interestRate) {
	super(accountNumber, balance, branch, dateOpened);
	this.interestRate = interestRate;
}



/**
 * @return the interestRate
 */
public double getInterestRate() {
	return interestRate;
}


/**
 * @param interestRate the interestRate to set
 */
public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}

public double calculateInterest() {
	double calculateInterest = super.getBalance()* ((interestRate / 100) / 12);
	return calculateInterest;
}


@Override
public String toString() {
	String output = super.toString() + "\nInterest Rate: " + interestRate;
	return output;
}

}
