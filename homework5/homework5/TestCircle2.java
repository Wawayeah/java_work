package homework5;

public class TestCircle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 myCircle = new Circle2(5.0);
		System.out.println("The area of the circle of radius "+myCircle.GetRadius()+" is "+myCircle.getArea());
		myCircle.setRadius(myCircle.GetRadius()*1.1);
		System.out.println("The area of the circle of radius "+myCircle.GetRadius()+" is "+myCircle.getArea());
		System.out.println("the number of objects created is "+myCircle.getNum());	
	}
}
