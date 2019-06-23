package study.week2;


public class Point {
  
	public Point(double x,double y, double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
  public double getX() {
	return this.x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return this.y;
}
public void setY(double y) {
	this.y = y;
}
public double getZ() {
	return this.z;
}
public void setZ(double z) {
	this.z = z;
}

public static void chg(Point p){
	Point newp ;
	newp = p;
	newp.setX(100);
	p.setX(200);
	newp =null;
}
//引包侠  namespace
public static void main(String []args){
	Point p1 = new Point(1,2,3);
	Point p2 = new Point(4,5,6);	
//	this
//	Point.chg(p1);
//	System.out.println
//	         ("p1.getX()="+p1.getX());
}

double x;
double y;
  double z;
}
