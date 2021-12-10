package homework8;
import java.util.Date;
public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account(1, 2000);
		CheckingAccount c = new CheckingAccount(114, 514, 1919);
		Saving_Account s = new Saving_Account();
		System.out.println(a.toString() + "\n" + c.toString() + "\n" + s.toString());
	}


}
