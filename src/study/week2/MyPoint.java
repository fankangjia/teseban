package study.week2;


public class MyPoint extends Point {

	private int kk;


	public MyPoint(double x, double y, double z) {
	
		super(x, y, z);
		this.kk =1;
//		System.out.println(super.getX());
//		System.out.println(this.getX());
		// TODO Auto-generated constructor stub
	}

	public double getX(){
//		System.out.println(super.getX());
		return 1.2;
		
	}
	
	public double getSth(){
		System.out.println(1.2);
		return 1.2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//父类引用指向子类对象
		
		
		MyPoint mp =	new MyPoint(4,5,6);
		Point p = mp;
		
		
		MyPoint mp1 = (MyPoint)p;
		mp1. getSth();
	
		
		
		
	/*	Point mp =	new Point(4,5,6);
		MyPoint p = (MyPoint)mp;
		
	       p.getSth();*/
	}

}
