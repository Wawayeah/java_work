package homework4;
import java.util.*;
public class h4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int list[]=new int[101];
		int num=-1;
		while(num!=0) {
			num=input.nextInt();
			list[num]++;
		}
		System.out.println(list.length);
		for (int i = 1; i < list.length; i++) {
            if (list[i] == 1) {
                System.out.println(i + " occurs " + list[i] + " time");
            }else if (list[i] > 1)
                System.out.println(i + " occurs " + list[i] + " times");
        }
		

	}

}
