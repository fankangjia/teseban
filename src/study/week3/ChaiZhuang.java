package study.week3;

public class ChaiZhuang {

	public static void main(String[] args) {
		Integer a=127;
		Integer A=1280;
		Integer b=127;//在-128到127直接不创建对象，直接从缓冲池中拿创建好的对象
		Integer B=1280;
		int c=a;
		System.out.println(a.equals(b));
		System.out.println(A.equals(B));//equals比较的是两个方法的值
		System.out.println(a==b);
		System.out.println(A==B);
	}

}
