package study.week2;
/**
 * 简单内部类
 * @author da_fa
 *
 */
//内部类的一个接口
interface Selector{
	boolean end();
	Object current();
	void next();
}
//内部类的外部类
public class Sequence {
	private Object[] items; //内类可以访问到外部类的所有方法，即使他是私有的
	private int next=0;
	public Sequence(int sizes) {items=new Object[sizes];}
	public void add(Object x) {
		if(next<items.length)
			items[next++]=x;
		
	}
	//内部类，实现接口Selector
	private class SequenceSelector implements Selector {
		private int  i=0;
		@Override
		public boolean end() {
			return i==items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if(i<items.length)
				i++;
		}
		
	}
	//创建SequenceSelector类的方法
	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		//初始化内部类的外部类
		Sequence seq=new Sequence(10);
		for(int i=0;i<10;i++) {
			seq.add(Integer.toString(i));
		}
		//调用外部类的方法获取内部类对象
		Selector sele=seq.selector();
		//使用内部类的方法来访问并输出所在的外部类的属性
		while(!sele.end()) {
			System.out.println(sele.current()+"  ");
			sele.next();
		}

	}

}
