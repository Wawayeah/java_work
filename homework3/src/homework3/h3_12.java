package homework3;
import java.util.*;
public class h3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈëĞĞÊı");
		int n=input.nextInt();
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= 2*(n-i);j++)
				System.out.print(" ");
			for(int m = i;m >= 1;m--)
				System.out.print(m + " ");
			for(int k = 2;k <= i;k++)
				System.out.print(k + " ");
			System.out.println();
		}
	}

}
