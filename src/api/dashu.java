package api;

import java.math.BigDecimal;
import java.text.DecimalFormat;
/**
 * 使用大数类写自己的加减乘除方法，并且实现小数位四舍五入
 * @author da_fa
 *
 */
public class dashu {
	BigDecimal big=new BigDecimal(0);
	/**
	 * 两个浮点数相加的方法
	 * @param a
	 * @param b
	 * @return 返回相加结果 double类型
	 */
	public double Add(double a,double b) {
		BigDecimal A=new BigDecimal(a);
		BigDecimal B=new BigDecimal(b);
		return A.add(B).doubleValue();
	}
	/**
	 * 两个浮点数相减的方法
	 * @param a
	 * @param b
	 * @return 返回相减结果的double类型
	 */
	public double Subtruct(double a,double b) {
		BigDecimal A=new BigDecimal(a);
		BigDecimal B=new BigDecimal(b);
		return A.subtract(B).doubleValue();
	}
	/**
	 * 保留小数方法凑小数位的方法 
	 * @param num
	 * @return 返回“000”这种类型的字符串
	 */
	public String getZero(int num) {
		String target="";
		for(int i=0;i<num;i++) {
			target+="0";
		}
		return target;
	}
	/**
	 * 两个浮点数相乘的方法
	 * @param a
	 * @param b
	 * @param num 保留几位小数
	 * @param shi 是否要使用四舍五入
	 * @return 返回一个double格式的结果
	 */
	public double multipl(double a,double b,int num,boolean shi) {
		BigDecimal A=new BigDecimal(a);
		BigDecimal B=new BigDecimal(b);
		if(shi) {
			DecimalFormat df2 =new DecimalFormat("#."+getZero(num));  
		    return Double.parseDouble(df2.format(A.multiply(B)));  
		}else {
			return A.multiply(B).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		}
	}
	/**
	 * 两个浮点数相除的结果哦
	 * @param a
	 * @param b
	 * @param num 保留几位小数
	 * @param shi 结果是否四舍五入
	 * @return 返回一个double类型的结果值
	 */
	public double divide(double a,double b,int num,boolean shi) {
		BigDecimal A=new BigDecimal(a);
		BigDecimal B=new BigDecimal(b);
		if(shi) {
			DecimalFormat df2 =new DecimalFormat("#."+getZero(num));  
		    return Double.parseDouble(df2.format(A.divide(B)));  
		}else {
			return A.divide(B).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		}
	}
	
}
