import lti.bank.AccountFactory;
import lti.bank.Bank;

public class TestAccount {
	public static void main(String[] args) {
		Bank sav = AccountFactory.openAccount("savings","Polo");
		sav.summary();

		sav.deposit(2000);
		sav.deposit(4000);
		sav.withdraw(3000);
		sav.withdraw(7000);
		
		sav.statement();
	}
}
