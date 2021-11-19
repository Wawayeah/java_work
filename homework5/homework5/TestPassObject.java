package homework5;

public class TestPassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 myCircle = new Circle2(1);
		int n=5;
		printAreas(myCircle,n);
		System.out.println("\n" + "Radius is "+ myCircle.GetRadius());
		System.out.println("n is "+n);
	}
	public static void printAreas(Circle2 c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.GetRadius()+"\t\t" + c.getArea());
			c.setRadius(c.GetRadius()+1);
			times--;
		}
	}

}
