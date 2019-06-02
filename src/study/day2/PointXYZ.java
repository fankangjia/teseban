package study.day2;
/**
 * 代表一个空间上的点，包括x，y，z三个值
 * @author da_fa
 * @since 2019-6-2
 */
public class PointXYZ {

	double x=0.0;
	double y=0.0;
	double z=0.0;
	PointXYZ(){
		
	}
	/**
	 * 带三个参数的构造方法
	 * @param x
	 * @param y
	 * @param z
	 */
	PointXYZ(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public static void chg(PointXYZ p) {
		PointXYZ newp=p;
		newp.setX(200);
		newp=null;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
}
