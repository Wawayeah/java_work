package homework5;

public class Circle2 {
	private double radius = 1;
	private static int num = 0;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public Circle2(){
			num++;
		}
		public Circle2(double newRadius){
			radius = newRadius;
			num++;
		}
		public static int getNum() {
			return num;
		}
		public double GetRadius() {
			return radius;
		}
		public void setRadius(double newRadius) {
			radius = (newRadius>=0) ? newRadius:0;
		}
		public double getArea() {
			return radius*radius*Math.PI;
		}
	}
