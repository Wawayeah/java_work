package homework4;
import java.util.*;
public class h4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num[]=new double[10];
		System.out.println("请输入十个数字：");
		for(int i=0;i<num.length;i++) {
			num[i]=input.nextDouble();
		}
		bulleSort(num);
		for(int j=0;j<num.length;j++) {
			System.out.print(num[j]+" ");
		}
	}
	public static void bulleSort(double a[]) {
		double temp;

        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
    }
}
