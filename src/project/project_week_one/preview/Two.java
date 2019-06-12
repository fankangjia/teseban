package project.project_week_one.preview;
class Person2{
	Person2(){
		System.out.println("我是父类Person的构造方法。");
	}
}
class Student2 extends Person2{
	Student2(){
		System.out.println("我是子类Student的构造方法。");
	}
}
public class Two {
	public static void main(String[] args) {
		Student2 stu=new Student2();
	}
}
