package study.week2.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
 
	private List<Integer> list;
	
	/*public void call(Bird b){
		b.run();
	}*/
	public void call(Animal b){
		b.run();//运行时动态绑定
	}
	
	public int compare(Comparable c1,
			Comparable c2){
		
		
				return c1.compareTo(c2);
		
	}
	
	public Object copy(Object o){
		
		return null;
	}
	public void add(List<Integer> list, Integer e){
		list.add(e);
	}
	
	public static void main(String[] args) {
		new Test().add(new ArrayList(),1);
		new Test().add(new LinkedList(),1);
		new Test().call(new Monkey());
		/*// TODO Auto-generated method stub

		Animal a = new Animal();
		a.run();
		
		Bird b  = new Bird();
		b.run();		
		Animal a1 = new Bird();		

		Bird b1 = (Bird)a1;
		
		b1.setSwing("123");
		b1.getSwing();
		
		
		Animal a3 = new Animal();
		Bird b3 = (Bird)a3;
		//1万行代码
		Bird b4 = b3;
		b4.getEye();
		*/
		
		
		
		
	    
		
		
		
		
	}

}
