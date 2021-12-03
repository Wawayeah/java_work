package homework7;

public class DynamicBindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}
	public static void m(Object x) {
		System.out.println(x.toString());
	}
}
class GraduateStudent extends Student{	
}
class Student extends Person{
	@Override
	public String toString() {
		return "Student";
	}
}
/*
 @Override是伪代码,表示重写(当然不写也可以)，不过写上有如下好处:
1、可以当注释用,方便阅读；
2、编译器可以给你验证@Override下面的方法名是否是你父类中所有的，如果没有则报错。
例如，你如果没写@Override，而你下面的方法名又写错了，这时你的编译器是可以编译通过的，
因为编译器以为这个方法是你的子类中自己增加的方法。
 */
class Person extends Object{
	@Override
	public String toString() {
		return "Person";
	}
}
