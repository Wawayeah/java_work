package homework6;
import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private double annualIntRate;
	private Date dateCreated;
	Account(){
		id=0;
		balance=0;
		annualIntRate = 0;
	}
	Account(int uId,double intBalance){
		id = uId;
		balance = intBalance;
	}
	public void setId(int newId) {
		id =  newId;
	}
	public int getId() {
		return id;
	}
	public void setBalance(int newBalance) {
		balance = newBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void setIntAnnualRate(double newAnnualRate) {
		annualIntRate = newAnnualRate;
	}
	public double getInterestAnnualRate(){
		return annualIntRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return balance * annualIntRate / 100 / 12;
	}
	public void withDraw(double withDrawBalance){
		balance -= withDrawBalance;
	}
	public void deposit(double depositBalance){
		balance += depositBalance;
	}
}
