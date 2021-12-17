package homework9;
import java.util.*;
//2、由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
//将输入的学生信息分别封装到一个Student对象中，
//再将每个Student对象加入到一个集合中，
//要求集合中的元素按照年龄大小正序排序；
//最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行
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
				throw new RuntimeException("不是Student对象");
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
