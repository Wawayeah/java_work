package homework5;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating object");
		System.out.println("the num of circle object is "+Circle.num);
		Circle c1=new Circle();
		System.out.println("\nAfter creating c1");
		System.out.println("c1:radius("+c1.radius +") and number of Circle object ("+c1.num+")");
		
		Circle c2 = new Circle(5);
		c1.radius = 9;
		
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1:radius("+c1.radius +") and number of Circle object ("+c1.num+")");
		System.out.println("c1:radius("+c2.radius +") and number of Circle object ("+c2.num+")");
	    	
	}

}
