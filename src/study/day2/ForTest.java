package study.day2;

public class ForTest {

	/**
	 * 字符串分割判断
	 * @param ss
	 */
	public static void forTest(String ss) {
		char[] charArray =ss.toCharArray();
		for(int i=0;i<ss.length();i++) {
			if(charArray[i]==',')
				System.out.print(" ");
			else if(charArray[i]==';')
				System.out.println();
			else System.out.print(charArray[i]);
		}
	}
	/**
	 * 字符串分割判断 split方法
	 * @param ss
	 */
	public static void forTest2(String ss) {
		for(String a:ss.split(";")) {
			for(String b:a.split(",")) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
	/** 
	 * 三目表达式判断成绩
	 * @param score
	 */
	public static void ScoreClass(int score) {
		System.out.println(score>80?"优秀":score>=60?"及格":"不及格");
	}
	public static void Calculate(String a,String b,String c,boolean ss) {
		if(a.indexOf(".")!=-1) {
			
		}
		
	}
	public static void main(String[] args) {
		String a="1,2;3,4,5;6,7;8,9";
		forTest2(a);
		ScoreClass(45);
		// 测试PointXYZ的
		
		PointXYZ a1=new PointXYZ(1,2,3);
		PointXYZ a2=new PointXYZ(3,4,5);
		a2=a1;
		a1.setX(100);
		a1=a2;
		System.out.println(a1.getX());
		PointXYZ.chg(a1);
		System.out.println(a1.getX());
	}
}
