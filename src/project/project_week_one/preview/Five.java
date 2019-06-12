package project.project_week_one.preview;
/**
 * 使用super调用父类已经被重写的方法
 * @author da_fa
 *
 */
class Employee{
	private String mobile="123465";
	protected String getContactInfo() {//这里使用的是protect修饰
		return "手机"+mobile;
	}
}
class Saleman extends Employee{
	private String msn="ccc";
	@Override
	public String getContactInfo() {//这里则使用public修饰，放松了限制
		return super.getContactInfo()+"  MSN"+msn;//可以使用super关键字调用被重写的父类方法
	}
}
public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Saleman().getContactInfo());;
	}

}
