package study.week3;


/**
 * 使用反射机制做对象复制方法
 * @author da_fa
 *
 */
class Professor implements Cloneable {
	String name;
	int age;
	Integer in;
	
	public Integer getIn() {
		return in;
	}

	public void setIn(Integer in) {
		this.in = in;
	}

	Professor(){}//使用反射机制拷贝，类必须有默认的无参构造器
	
	public String getName() {
		return name;
	}

	public void setName(String name) {///必须还要有getset方法
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Professor(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

class Student implements Cloneable {
	String name;
	int age;
	Professor p;
	
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
	public Professor getP() {
		return p;
	}
	public void setP(Professor p) {
		this.p = p;
	}
	Student(){}
	Student(String name, int age, Professor p) {
		this.name = name;
		this.age = age;
		this.p = p;
	}

}

public class CopyByFanshe {
	public static void main(String args[]) {
		Professor p = new Professor("wangwu", 50);
		Student s1 = new Student("zhangsan", 18, p);
		Student s2;
		try {
			s2 = (Student) MyObjectCopy.copy(s1);
			s2.p.name = "lisi";
			s2.p.age = 30;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("name=" + s1.p.name + "," + "age=" + s1.p.age);// 学生1的教授不改变。
		
		//判断是不是基本类型的方法
		System.out.println(int.class.isPrimitive());
		System.out.println(String.class.isPrimitive());
	}
}

