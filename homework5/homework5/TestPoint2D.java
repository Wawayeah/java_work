package homework5;
import java.util.Scanner;
import javafx.geometry.Point2D;
public class TestPoint2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("输入Point1的x、y轴坐标");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("输入Point2的x、y轴坐标");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		System.out.println("p1 is " + p1.toString());
		System.out.println("p2 is "+p2.toString());
		System.out.println("两点之间的距离是 "+p1.distance(p2));
		System.out.println("两点之间的中点是 "+p1.midpoint(p2).toString());
	}

}
