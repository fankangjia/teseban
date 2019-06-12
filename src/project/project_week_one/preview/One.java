package project.project_week_one.preview;
/**
 * 一个最简单的继承关系
 * 学生继承人类的属性
 * @author da_fa
 *
 */
//人，类，
class Person{
	private String name;
	private int age;
	protected  String ceshi="我是protect的属性，子类和同一包里的方法都可以直接使用";
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
//学生类
class Student extends Person{
	private String school;
	private int grade;
	Student(){
		System.out.println("直接访问父类的属性ceshi:  "+ceshi);
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return super.toString()+" Student [school=" + school + ", grade=" + grade + "]";
	}
	
}
public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.setSchool("HBFU");
		stu.setAge(22);
		stu.setGrade(3);
		stu.setName("fkj");
		System.out.println(stu);
	}

}
