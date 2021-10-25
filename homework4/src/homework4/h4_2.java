package homework4;
import java.util.*;
public class h4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		int[] num = new int[10];
		int count = 0, m, flag;
		System.out.print("Enter ten number: ");
		for(int i = 0; i < 10; i++) {
			flag = 0;
			m = input.nextInt();
			for(int j = 0; j < i; j++)
				if(m == num[j]){
					flag = 1;
					break;
				}
			if(flag == 0) num[count++] = m;
		}	
		
		System.out.println("The number of distinct number is " + count);
		System.out.print("The distinct numbers are ");
		for(int i = 0; i < count; i++) {
			System.out.print(num[i]);
			if(i < count-1) System.out.print(" ");
		}
		System.out.println();
	}

}
