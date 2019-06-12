package project.project_week_one.preview;
/**
 * 抽象类的定义以及使用
 * @author da_fa
 *
 */
abstract class Fruit{//定义一个抽象类
	public String color;
	public Fruit() {
		color="绿色";
	}
	public abstract void harvest();//定义一个抽象方法，抽象方法没有方法体
}
class Apple extends Fruit{//苹果类继承水果类
	public void harvest() {
		System.out.println("苹果已经被收获！");
	}
}
class Orange extends Fruit{
	public void harvest() {//必修重写抽象类中未实现的方法
		System.out.println("橘子已经被收获！");
	}
}
public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f1=new Apple();
		f1.harvest();
		f1=new Orange();
		f1.harvest();

	}

}
