package homework8;
import java.util.ArrayList;
import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		System.out.print("Enter the array size n: ");
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int[][] mt = new int[s][s];
		ArrayList<Integer> rows = new ArrayList<>();
		ArrayList<Integer> columns = new ArrayList<>();
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++)
				mt[i][j] = (int) (Math.random() * 2);
		}
		for (int i = 0; i < s; i++) {
			int sum = 0;
			for (int j = 0; j < s; j++) {
				if (mt[i][j] == 1)
					sum++;
			}
			rows.add(sum);
		}
		for (int j = 0; j < s; j++) {
			int sum = 0;
			for (int i = 0; i < s; i++) {
				if (mt[i][j] == 1)
					sum++;
			}
			columns.add(sum);
		}
		System.out.println("The random array is ");
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				System.out.print(mt[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The largest row index: " +java.util.Collections.max(rows));
		System.out.println("The largest column index: "+java.util.Collections.max(columns));

	}

}
