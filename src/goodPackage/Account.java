package goodPackage;

public class Account implements AccountFactory {

	// private ArrayList<stuff> listType = new ArrayList();
	// ^ here or in AccFactory?

	Account type; // ?

	// should i have a constructor? hehe
	public Account() {

		// account type, or here?
		// CD, checkings, savings, money market
		// need to be able to grab list while:
		// open for extension, closed for modification

	}

	@Override
	public void deposit() {

	}

	@Override
	public void withdraw() {

	}

	@Override
	public void getAccountType() {
		// return my type
	}

	private void fireBalanceChanged() {

	}
}
