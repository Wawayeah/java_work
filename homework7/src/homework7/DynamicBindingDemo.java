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
 @Override��α����,��ʾ��д(��Ȼ��дҲ����)������д�������ºô�:
1�����Ե�ע����,�����Ķ���
2�����������Ը�����֤@Override����ķ������Ƿ����㸸�������еģ����û���򱨴�
���磬�����ûд@Override����������ķ�������д���ˣ���ʱ��ı������ǿ��Ա���ͨ���ģ�
��Ϊ��������Ϊ�������������������Լ����ӵķ�����
 */
class Person extends Object{
	@Override
	public String toString() {
		return "Person";
	}
}
