package goodPackage;

/**
 * produces different types of accounts
 * 
 * Optional: New account types can be ++ to the program w/o req recompilation
 *
 * Clients must be able to query [this factory] to get a list of account types
 * that it can produce
 */

public interface AccountFactory {

	// need a list of account types

	public void deposit();

	public void withdraw();

	public void getAccountType();

}