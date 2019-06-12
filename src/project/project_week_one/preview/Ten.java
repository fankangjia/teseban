package project.project_week_one.preview;
/**
 * 抽象类，所有的方法都没有方法体
 * @author da_fa
 *
 */
interface Door{
	public void open();//不实现的方法
	public void close();//不实现的方法二
}
class House implements Door{

	@Override
	public void open() {
		System.out.println("房子的门被打开了。");
	}

	@Override
	public void close() {
		System.out.println("房子的门被关上了。");
	}
	
}
class Car implements Door{

	@Override
	public void open() {
		System.out.println("车的门被打开了。");
	}

	@Override
	public void close() {
		System.out.println("车子的门被关上了");
	}
	public void carcar() {
		System.out.println("这是car类独有的方法。");
	}
	
}
public class Ten {

	public static void main(String[] args) {
		
		Door door=new House();
		door.open();
		door.close();
		door=new Car();
		door.open();
		door.close();
		door.carcar();//不能使用类中的独有方法

	}

}
