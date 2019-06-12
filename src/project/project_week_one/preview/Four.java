package project.project_week_one.preview;
/**
 * 重写父类的方法
 * @author da_fa
 *
 */
class Vehicle{
	public void run (){
		System.out.println("交通工具在跑。");
	}
}
class Truck extends Vehicle{
	@Override //表示重写的方法，会自动检查
	public void run() {
		System.out.println("卡车再跑。");
	}
}
class Airplane extends Truck{
	@Override
	public void run() {
		System.out.println("飞机在飞。");
	}
}
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
