package project.project_week_one.preview;

import java.util.Random;

abstract class Shape{
	public abstract void draw();
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("画一个矩形。");
	}
}
class Circle extends Shape{
	public void draw () {
		System.out.println("换一个圆形。");
	}
}
class Triangle extends Shape{
	public void draw() {
		System.out.println("画一个三角形。");
	}
}
public class Poly8 {
	
	Random rand=new Random();
	public Shape createShape() {
		int c=rand.nextInt(3);
		Shape s=null;
		switch (c) {
		case 0:
			s=new Rectangle();
			break;
		case 1:
			s=new Circle();
			break; 
		case 2:
			s=new Triangle();
			break;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly8 poly=new Poly8();
		for(int i=0;i<5;i++) {
			poly.createShape().draw();
		}

	}

}
