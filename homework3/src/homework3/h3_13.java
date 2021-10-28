package homework3;
import java.util.*;
public class h3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入资金");
		double loanAmount = input.nextDouble();
		
		System.out.print("请输入年份");
		int years = input.nextInt();
		
		System.out.printf("%-20s%-20s%s\n","Interest Rate","Monthly Payment","Total payment");
		for(double i=5.0;i<8.0;i+=1.0/8) {
			double monthlyRate = i / 1200.0;
            double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1+monthlyRate, years * 12));
            System.out.printf("%.3f%%            %-20.2f%.2f\n", i, monthlyPayment, monthlyPayment * 12 * years);
		}
		
	}

}
