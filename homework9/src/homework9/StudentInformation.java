package homework9;
import java.util.*;
//2���ɿ���̨���չ̶���ʽ����ѧ����Ϣ������ѧ�ţ�������������Ϣ�������������Ϊexit�˳���
//�������ѧ����Ϣ�ֱ��װ��һ��Student�����У�
//�ٽ�ÿ��Student������뵽һ�������У�
//Ҫ�󼯺��е�Ԫ�ذ��������С��������
//���������ϣ���������ѧ����Ϣд�뵽���±���ÿ��ѧ������ռ����һ��
public class StudentInformation {
	static class Student{
		String sid;
		String name;
		int age;
		public Student(String sid,String name,int age) {
			this.age = age;
			this.name = name;
			this.sid = sid;
		}
		public String getSid() {
			return sid;
		}
		public void setSid(String sid) {
			this.sid = sid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int compare(Object a) {
			if(!(a instanceof Student)) {
				throw new RuntimeException("����Student����");
			}
			Student p = (Student) a;
			if(this.age>p.age) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Set<Student> stu = new TreeSet<Student>();
		while(true) {
			String sid = input.next();
			if("exit".equals(sid)) {
				break;
			}
			String name = input.next();
			int age = input.nextInt();
			Student x = new Student(sid,name,age);
			stu.add(x);
		}
		Iterator<Student> it = stu.iterator();
		while(it.hasNext()) {
			Student student = (Student)it.next();
			System.out.println("name:" + student.getName());
		}
	}

}
