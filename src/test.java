
public class test {

	public static void main(String[] args) {
		long startTime=System.nanoTime(); 
		System.out.println("执行代码块/方法");
		long endTime=System.nanoTime(); 
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
	
	}

}
