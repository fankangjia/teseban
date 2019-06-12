package project.project_week_one.preview;
/**
 * super关键字的使用
 * @author da_fa
 *@since 2019-6-10
 */
class Person3 {
	private String name;
	private int age;
	public Person3(String name,int age) {
		this.age=age;
		this.name=name;
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
	@Override
	public String toString() {
		return "Person3 [name=" + name + ", age=" + age + "]";
	}
	
	
}
class Student3 extends Person3{
	private String school;
	private int grade;
	public Student3(String name,String school,int age,int grade) {
		super(name,age);
		this.grade=grade;
		this.school=school;
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
		return super.toString()+"   Student3 [school=" + school + ", grade=" + grade + "]";
	}
	
}
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 stu=new Student3("fkj","HBFU",22,3);
		System.out.println(stu);
	}

}
