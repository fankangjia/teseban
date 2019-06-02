package study.day2;

public class Qiuhe {

	/**
	 * 使用for循环做计算小于num的所有偶数的和
	 * @param num
	 * @return
	 */
	public static int qiuhe(int num) {
		for(int i=num-2;i>0;i=i-2) {
			num+=i;
		}
		return num;
		
	}
	/**
	 * 使用递归做
	 * @param num
	 * @return
	 */
	public static int qiuhe2(int num) {
		if(num>0)
			return num+qiuhe(num-2);
		else
			return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(qiuhe(10));
		System.out.println(qiuhe2(10));
	}

}
