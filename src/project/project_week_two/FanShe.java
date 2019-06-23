package project.project_week_two;

import java.util.ArrayList;

/**
 * java核心技术反射知识点总结
 * @author da_fa
 *
 */
class ppp{
	String str="一个类";
}

public class FanShe {

	public static void main(String[] args) {
		//通过对象获取类名的一些方法
		ArrayList a=new ArrayList<String>();
		System.out.println("ArrayList.class：                  "+ArrayList.class);//通过类名获取类全名？？？感觉有点鸡肋啊
		System.out.println("ArrayList.class.getName()："+ArrayList.class.getName());
		System.out.println("a.getClass()：                        "+a.getClass());//通过一个对象获取类全名
		System.out.println("a.getClass().getName()：      "+a.getClass().getName());
		//注意：历史原因，会有些地方出现异常
		System.out.println("Double[].class.getName()   "+Double[].class.getName());
		System.out.println("int[].class.getName()      "+int[].class.getName());
		//重要方法newInstance()；构造一个默认构造器的新对象，没有默认构造器会抛出异常。比如
		//*************************重要方法*****************************
		try {
			ppp p=ppp.class.newInstance();//创建一个类
			System.out.println(p.str);
		} catch (InstantiationException | IllegalAccessException e) {
			// 没有默认构造器就会抛出异常
			e.printStackTrace();
		}
		//*************************重要方法*****************************
		//直接通过类的完整名称创建对象
		try {
			ppp p2=(ppp) Class.forName("project.project_week_two.ppp").newInstance();
			
			System.out.println(p2.str);
			System.out.println("Class.forName(\"project.project_week_two.ppp\")="+Class.forName("project.project_week_two.ppp"));
			System.out.println("Class.forName(\"project.project_week_two.ppp\").getClass()="+Class.forName("project.project_week_two.ppp").getClass());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// 找不到类的异常
			e.printStackTrace();
		}
		//**********************一个总结***************************
		/*
		 * 通过 ppp.class p.getClass  Class.forName(\"project.project_week_two.ppp\")获取到的是同一个东西。
		 * 一个java.lang.Class类型的对象
		 */
		//*********************************************************

	}

}
