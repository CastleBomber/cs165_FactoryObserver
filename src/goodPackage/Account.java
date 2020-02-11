package goodPackage;

<<<<<<< HEAD
import java.util.ArrayList;

public class Account {

	private ArrayList<Account> accountTypes = new ArrayList();

	public Account() {

	}

	public void deposit(){

	}

	public void withdraw(){

	}

//	public ArrayList getAccountType(){
//
//	}

	public void addBalanceChangedListener(BalanceChangedListener listener){

	}

	public void removeBalanceChangedListener(BalanceChangedListener listener){

=======
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
>>>>>>> 973da671227ae473816775bda214928f131f7263
	}

	private void fireBalanceChanged() {

	}
}
