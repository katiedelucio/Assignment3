
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
		// create ArrayList to store bank accounts
		ArrayList<Account> bankaccounts = new ArrayList<>();

		// CheckingAccount needs int accountNumber, double balance, String branch,
		// String dateOpened,String checkStyle, double minimumBalance
		CheckingAccount acct1 = new CheckingAccount(1, 100, "Chicago", "1/31/22", "Fancy style", 50.00);
		bankaccounts.add(acct1);
		// create customers-Commercial
		// String name, String address, String phone, Account account, double
		// creditRating,
		// String contactPerson, String contactPersonPhone
		CommercialCustomer jan = new CommercialCustomer("Jan Doe", "11 Main Street", "876-213-3333", acct1, 300,
				"Jeff Doe", "876-213-3333");
		displayInfo(jan);
		acct1.makeDeposit(100);
		displayInfo(jan);
		// create 2nd checking account and add to arraylist
		CheckingAccount acct2 = new CheckingAccount(2, 200, "Indianapolis", "10/30/19", "Basic style", 50.00);
		bankaccounts.add(acct2);

		// SavingsAccount needs int accountNumber, double balance, String branch, String
		// dateOpened, double interestRate
		SavingsAccount acct3 = new SavingsAccount(3, 100, "Denver", "1/28/18", 10.0);
		bankaccounts.add(acct3);
		// create personal customer
		// String name, String address, String phone, Account account, String homePhone,
		// String workPhone)
		PersonalCustomer rod = new PersonalCustomer("Rod Jones", "1100 My Way", "555-222-4444", acct3, "555-222-4444",
				"555-123-4567");
		displayInfo(rod);
		acct3.makeDeposit(100);
		acct3.calculateInterest();
		System.out.println(
				"The new balance is " + acct3.getBalance() + " and monthly interest is " + acct3.calculateInterest());

	}

	public static void displayInfo(Customer x) {
		System.out.println("\n" + x.toString());

	}
}
