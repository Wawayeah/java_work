package homework7;

public class TestCircleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(1);
		System.out.println("a circle "+circle.toString());
		System.out.println("the color is "+circle.getColor());
		System.out.println("the radius is "+circle.getRadius());
		System.out.println("the area is "+circle.getArea());
		System.out.println("the diameter is "+circle.getDiameter());
		
		Rectangle rectangle = new Rectangle(2,4);
		System.out.println("\nA rectangle "+rectangle.toString());
		System.out.println("the area is "+rectangle.getArea());
		System.out.println("the perimeter is "+rectangle.getPerimeter());
	}

}
