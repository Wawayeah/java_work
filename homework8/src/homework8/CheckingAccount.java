package homework8;

public class CheckingAccount {
	private double overDraw;
	public CheckingAccount() {
		super();
	}

	public CheckingAccount(int i, double b, double o) {
		super(i,b);
		overDraw = o;
	}
}
