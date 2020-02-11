package goodPackage;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> 973da671227ae473816775bda214928f131f7263
/**
 * produces different types of accounts
 * 
 * Optional: New account types can be ++ to the program w/o req recompilation
 *
 * Clients must be able to query [this factory] to get a list of account types
 * that it can produce
 */

<<<<<<< HEAD
public class AccountFactory {

	// need a list of account types

	/**
	 * Factory method's quintessential method
	 * layer of abstraction
	*/
	public Account createAccount(String accountType){

		Account newAccount = null;

		if(accountType == null){
			return null;
		}
		if(accountType.equalsIgnoreCase("Checkings")){
			newAccount = new Checkings();
		} else if(accountType.equalsIgnoreCase("Savings")){
			newAccount = new Savings();
		} else if (accountType.equalsIgnoreCase("MoneyMarket")) {
			newAccount = new MoneyMarket();
		} else if (accountType.equalsIgnoreCase("CD")){
			newAccount = new CD();
		}

		return newAccount;
	}
=======
public interface AccountFactory {

	// need a list of account types

	public void deposit();

	public void withdraw();

	public void getAccountType();

>>>>>>> 973da671227ae473816775bda214928f131f7263
}