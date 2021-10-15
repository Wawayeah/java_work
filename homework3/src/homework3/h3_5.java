package homework3;
import java.util.*;
public class h3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month, day, h, q, m, j, k;
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入年份");
		year=input.nextInt();
		System.out.println("请输入月份");
		month=input.nextInt();
		System.out.println("请输入日期");
		day=input.nextInt();
		
		q=day;
		if(month == 1 || month == 2)
		{
			month += 12;
			year -= 1;
		}
		j=year/100;
		k=year%100;
		h = (q + (26 * (month+ 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
		// Display the day of the week
				switch(h)
				{
					case 0:
						System.out.println("Day of the week is Saturday");
						break;
					case 1:
						System.out.println("Day of the week is Sunday");
						break;
					case 2:
						System.out.println("Day of the week is Monday");
						break;
					case 3:
						System.out.println("Day of the week is Tuesday");
						break;
					case 4:
						System.out.println("Day of the week is Wednesday");
						break;
					case 5:
						System.out.println("Day of the week is Thursday");
						break;
					case 6:
						System.out.println("Day of the week is Friday");
						break;
				}

	}

}
