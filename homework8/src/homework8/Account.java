package homework8;
import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private double Rate;
	private Date dateCreated;
	public Account() {
		id = 0;
		balance = 0;
		Rate = 0;
		dateCreated = new Date();
	}

	public Account(int i, double b) {
		id = i;
		balance = b;
		Rate = 0;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int j) {
		id = j;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double j) {
		balance = j;
	}

	public double getAnnualInterestRate() {
		return Rate;
	}

	public void setAnnualInterestRate(double j) {
		Rate = j;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return Rate / 12;
	}

	public double getMonthlyInterest() {
		return Rate / 12 * balance;
	}

	public void withDraw(double m) {
		balance -= m;
	}

	public void deposit(double m) {
		balance += m;
	}

}
