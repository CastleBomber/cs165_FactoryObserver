package goodPackage;
/**
 * produces different types of accounts
 * 
 * Optional: New account types can be ++ to the program w/o req recompilation
 *
 * Clients must be able to query [this factory] to get a list of account types
 * that it can produce
 */

public class AccountFactory {

	// need a list of account types

	/**
	 * Factory method's quintessential method
	 * layer of abstraction
	 */
	public Account createAccount(String accountType) {

		Account newAccount;

		if (accountType.equalsIgnoreCase("Checkings")) {
			newAccount = new Checkings();
		} else if (accountType.equalsIgnoreCase("Savings")) {
			newAccount = new Savings();
		} else if (accountType.equalsIgnoreCase("MoneyMarket")) {
			newAccount = new MoneyMarket();
		} else if (accountType.equalsIgnoreCase("CD")) {
			newAccount = new CD();
		} else {
			newAccount = null;
		}


		return newAccount;
	}
}