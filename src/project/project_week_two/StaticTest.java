package project.project_week_two;
/**
 * 测试static参数的作用
 * @author da_fa
 *
 */
class TodayStudy{
	static int hours=0;//类会在首次被“主动使用”时执行初始化，为类（静态）变量赋予正确的初始值
	TodayStudy(){
		hours++;
	}
	public static void Study() {//static修饰的是静态方法
		System.out.println("今天学习了"+hours+"小时。");
	}
}

public class StaticTest {

	public static void main(String[] args) {
		TodayStudy.Study();//静态方法可以通过类名直接调用，而不用初始化对象。
		for(int i=0;i<8;i++) {
			new TodayStudy();
			TodayStudy.Study();//通过输出可以看到，输出值是连续的。因为static变量不属于某个特定的对象而是属于这个类
		}
	}

}
