package homework3;
import java.util.*;
public class h3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,distance;
		Scanner input = new Scanner(System.in);
		a=input.nextDouble();
		b=input.nextDouble();
		distance = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		if(distance <= 10)
			System.out.println("Point " + "(" + a + "," + b + ")"
								+ " is in the circle");
		else
			System.out.println("Point " + "(" + a + "," + b + ")"
								+ " is not in the circle");
	}

}
