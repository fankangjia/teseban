package project.project_week_one.preview;
/**
 * 包装类以及数据类型的转化
 * 包装类有Integer Double Float Long Byte Boolean Short Char
 * @author da_fa
 *
 */
public class BaoZhuang9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer in=new Integer(5);
		Double doub=new Double(5.5);
		String str=new String("3.2");
		String str2=new String("3");
		System.out.println("数字转化为字符串："+"in.toString().getClass():"+in.toString().getClass()+"  doub.toString().getClass():"+doub.toString().getClass());
		System.out.println("字符串转数字"+(in.parseInt(str2)+5)+"   "+(doub.parseDouble(str)+6.6));
	}

}
