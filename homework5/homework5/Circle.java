package homework5;

public class Circle {
	double radius;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		static int num = 0;
		Circle(){
			radius = 1;
			num++;
		}
		Circle(double newRadius){
			radius = newRadius;
			num++;
		}
		static int getNum() {
			return num;
		}
		double getArea() {
			return radius*radius*Math.PI;
		}
	}

//}
