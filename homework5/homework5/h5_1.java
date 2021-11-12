package homework5;

public class h5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle();
		System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());
		
		Circle circle2 = new Circle(25);
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
	
		circle2.radius = 100;
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
	}
}
class Circle{
	double radius;
	Circle(){
		radius=1;
	}
	Circle(double newRadius){
		radius = newRadius;
	}
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	double getPerimeter() {
		return 2* radius * Math.PI;
	}
//	void setRadius(double newRadius) {
//		radius = newRadius;
//	}
}
