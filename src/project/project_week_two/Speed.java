package project.project_week_two;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * 写代码测试arraylist与linkedlist的查询增加插入的效率对比
 * @author da_fa
 * 
 */
public class Speed {
	/**
	 * ArrayList添加元素的方法
	 * @param array
	 */
	public static void arrayadd(ArrayList<String> array) {
		for(int i=0;i<200000;i++)
			array.add(i+"str");
	}
	/**
	 * ArrayList查询的方法
	 * @param array
	 * @param str 需要查询的字符串
	 * @return 返回字符串的位置
	 */
	public static int arraySearch(ArrayList<String> array,String str) {
		return array.indexOf(str);
	}
	/**
	 * ArrayList随机位置插入元素
	 * @param array
	 */
	public static void insertArray(ArrayList<String> array,String str) {
		int num=(int)(Math.random()*(array.size()-1+1));
		array.add(num, str);
	}
	/**
	 * Linkedlist添加元素的方法
	 * @param link
	 */
	public static void Linkadd(LinkedList<String> link) {
		for(int i=0;i<200000;i++)
			link.add(i+"str");
	}
	/**
	 * Linklist查询元素的方法
	 * @param lisk 
	 * @param str
	 * @return 返回元素的位置
	 */
	public static int LinkSearch(LinkedList<String> lisk,String str) {
		return lisk.indexOf(str);
	}
	/**
	 * linkedList随机位置插入元素的方法
	 * @param array
	 * @param str 要插入的元素
	 */
	public static void insertLink(LinkedList<String> array,String str) {
		int num=(int)(Math.random()*(array.size()-1+1));
		array.add(num, str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array=new ArrayList<String>();
		LinkedList<String> linked=new LinkedList<String>();
		long startTime,endTime;
		
		
		startTime=System.nanoTime(); 
		arrayadd(array);
		endTime=System.nanoTime(); 
		System.out.println("ArrayList添加200000个String时间：              "+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime(); 
		Linkadd(linked);
		endTime=System.nanoTime(); 
		System.out.println("linkedList添加200000个String时间：           "+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime(); 
		for(int i=78;i<78+20000;i++)
			insertArray(array,"str"+i);
		endTime=System.nanoTime(); 
		System.out.println("ArrayList随机位置插入20000个String时间： "+(endTime-startTime)+"ns");
				
		startTime=System.nanoTime(); 
		for(int i=78;i<78+20000;i++)
			insertLink(linked,"str"+i);
		endTime=System.nanoTime(); 
		System.out.println("LinkedList随机位置插入20000个String时间："+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime(); 
		for(int i=78;i<78+20000;i++)
			array.add(i+"ing");
		endTime=System.nanoTime(); 
		System.out.println("ArrayList末尾插入20000个String时间：        "+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime(); 
		for(int i=78;i<78+20000;i++)
			linked.add(i+"ing");
		endTime=System.nanoTime(); 
		System.out.println("LinkedList末尾插入20000个String时间：        "+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime(); 
		for(int i=78;i<78+20000;i++)
			arraySearch(array, i+"ing");
		endTime=System.nanoTime(); 
		System.out.println("ArrayList查找20000个String时间：             "+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime(); 
		for(int i=78;i<78+20000;i++)
			LinkSearch(linked, i+"ing");
		endTime=System.nanoTime(); 
		System.out.println("LinkedList查询20000个String时间：            "+(endTime-startTime)+"ns");
		/**
		 * 运行时间比较长，所以我把结果贴在这里了
		 * 
		 * ArrayList添加200000个String时间：                70780100ns
		 * linkedList添加200000个String时间：              40079600ns
		 * 
		 * ArrayList随机位置插入20000个String时间：    589116000ns
		 * LinkedList随机位置插入20000个String时间：  31781116600ns
		 * 
		 * ArrayList末尾插入20000个String时间：           2839700ns
		 * LinkedList末尾插入20000个String时间：         3152800ns
		 * 
		 * ArrayList查找20000个String时间：                  28088415400ns
		 * LinkedList查询20000个String时间：                91148975400ns
		 * 
		 * 运行多次发现add（）方法运行时间每次不一样而且有时是ArrayList快有时Linkedlist快
		 * 在随机插入和查询中ArrayList的速度优势比较明显，虽然每次使用的时间都不一样，但是ArrayList明显时间短
		 * 随机插入情况下ArrayList效率对比最明显
		 */
	}

}
