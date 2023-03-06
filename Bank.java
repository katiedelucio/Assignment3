
/**
 * 
 */

/**
 * @author Katie DeLucio
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyAccounts kd = new MyAccounts();
		kd.createAccounts();
		kd.displayAccountInfo();
		
	}
}

class MyAccounts {
	// create ArrayList to store bank accounts
	ArrayList<Account> bankaccounts = new ArrayList<>();

	public void createAccounts() {
		// CheckingAccount needs int accountNumber, double balance, String branch,
		// String dateOpened,String checkStyle, double minimumBalance
		CheckingAccount acct1 = new CheckingAccount(1, 100, "Chicago", "1/31/22", "Fancy style", 50.00);
		bankaccounts.add(acct1);
		acct1.makeDeposit(100);
		
		CheckingAccount acct2 = new CheckingAccount(2, 200, "Indianapolis", "10/30/19", "Basic style", 50.00);
		bankaccounts.add(acct2);

		// SavingsAccount needs int accountNumber, double balance, String branch, String
		// dateOpened, double interestRate
		SavingsAccount acct3 = new SavingsAccount(3, 100, "Denver", "1/28/18", 10.0);
		bankaccounts.add(acct3);
		
		acct3.makeDeposit(100);
		System.out.println(bankaccounts.toString());
		//System.out.println("The interest earned is " + acct3.calculateInterest() + " per month.");
		

	}
	//find account so it can be displayed in displayAccountInfo
	public Account findAccount(int accountNumber) {
		for (Account a : bankaccounts) {
			if (a.getAccountNumber() == accountNumber);
			return a;
		}
		return null;
	}

	// display account info given the account number
	public void displayAccountInfo() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the account number of the account that you want to display: ");
		int acctn = input.nextInt();
		Account a = findAccount(acctn);
		if (a == null) {
			System.out.println("\nAccount not found.");
		} else {
			System.out.println();
			System.out.println("Details for the account with the number " + acctn + ": ");
			System.out.println(a);
			System.out.println();
		}
	}	
	}



