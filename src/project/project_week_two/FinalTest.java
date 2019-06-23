package project.project_week_two;

import java.util.Random;
final class cc{
	//final修饰的类不能被继承
}
class Value{
	int c=6;
	Value(int c){
		this.c=c;
	}
	public Value() {
		
	}
	public final void speak() {//final修饰方法，禁止继承的子类改动这个方法
		System.out.println("儿子不要改爸爸的方法");
	}
	private final void say() {
		
	}
	@Override
	public String toString() {
		return "Value [c=" + c + "]";
	}
	
}
class ValueSon extends Value{
	ValueSon() {
		super();
		
	}
	ValueSon(int c) {
		super(c);
		
	}
	private void say() {}//一个例外，当父类中final方法是private的时候可以覆盖，或者说可以写同名方法
	//public void speak() {		System.out.println("我就要改！！");	} 这个方法会报错
}
class Mine{
	int a=2;
	final int b=3;//这里的作用是保证初始化的值不被改变
	static final int A_NUM=5;//final+static 变量会唯一并且不会被改变。占据一段不会被改变的存储空间
	final int blank;//空白的final
	final Value va;//空白的final对象引用
	static Random rand=new Random();
	final int random=rand.nextInt(20);//从这个方法看出final的变量不一定每一次都是一样的。
	Mine(){
		blank=56;//空白的final值在构造方法中必须被初始化
		va=new Value(56);//不然就会报错
	}
	Mine(int x){
		blank=x;
		va=new Value(x);
	}
	@Override
	public String toString() {
		return "Mine [a=" + a + ", b=" + b + ", blank=" + blank + ", va=" + va.toString() + ", random=" + random + "]";
	}
	
	
}
public class FinalTest {
	//
	public static void  change(final Mine me) {
		me.a=123;
		System.out.println(me);
		//me=new Mine();这样写就是错的，因为这样是参数的值不能改变，但是引用对应的对象内容可以改变
	}
	public static void main(String[] args) {
		Mine me=new Mine(54);
		System.out.println(me);
		Mine me2=new Mine();
		System.out.println(me2);
		me2.a=77;
		me2.va.c=599;//此处注意，虽然final修饰变量值不可变，但是修饰一个对象引用，引用不可变但是对象的内容可变
		System.out.println(me2);
		change(me2);
		System.out.println(me2);//可以看到输出结果，虽然参数有final关键词，但是me2对象的内容依然被改变了
		
		
		ValueSon son=new ValueSon();
		son.speak();
	}

}
