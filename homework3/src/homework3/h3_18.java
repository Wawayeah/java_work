package homework3;
import java.util.*;
public class h3_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");

	        int num = input.nextInt();
	        int m = num;
	        String s = "";

	        while(m > 0){
	            s = (m % 2) + s;
	            m /= 2;
	        }

	        System.out.println(num + "'s binary is " + s);

	}

}
