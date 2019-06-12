package project.project_week_one;
/**
 * 数组去重，两个版本，第一版为对指定数组去重；
 * 第二版为对数组中指定重复次数的元素去重。
 * @author fankangjia
 * @since 2019-6-4
 */
public class RemoveDuplication {

	/**
	 * 删除指定数组指定下表的元素
	 * @param a 数组
	 * @param b 要删除的元素下标
	 * @return 返回一个删除完成后的数组
	 */
	public static int[] delete(int[] a,int b) {
		for(int i=b;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		//需要输入的数组中的值没有小于-10000
		a[a.length-1]=-10000;
		return a;
	}
	/**
	 * 指定数组去重
	 * @param a
	 * @return 返回一个去重后的数组
	 */
	public static int[] quchong(int[] a) {
		//冒泡排序，先对数组进行初步处理
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
				
		//判断重复的元素并删除
		for(int i=0,j=0;i<a.length-1;i++,j++) {
			c=a[i];
			while(a[j]==a[j+1]) {
				delete(a,j);
				i++;
				if(i==a.length-1)
					break;
			}
		}
		return a;
	}
	
	//去重方法二
	/**
	 * 去除指定重复次数的数组中的重复值
	 * @param a 数组
	 * @param times 重复次数
	 * @return 返回一个结果数组
	 */ 
	public static int[] quchong(int[] a,int times) {
		//冒泡排序，先对数组进行初步处理
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		
		//判断重复的元素次数并删除
		for(int i=0,j=0;i<a.length-1;i++,j++) {
			c=a[i];
			int flag=times-1;
			while(a[j]==a[j+1]) {
			flag--;
			if(flag<=0) {
				delete(a,j);
			}else j++;
			i++;			
			if(i==a.length-1)
				break;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int[] a= {2,9,3,4,5,7,8,2,2,3,5,7};
		System.out.print("原始数组：");
		for(int i:a) {
			//原数组
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		//首先调用去重方法1，直接去重
		int[] b=quchong(a);
		System.out.print("去重结果：");
		for(int i:b) {
			//输出去重结果
			if(i>-10000)
			System.out.print(i+" ");
			else break;
		}
		System.out.println();
		int[] a2= {2,9,3,4,5,7,8,2,2,3,5,7,6,6,6,8,8};
		//调用去重二方法
		b=quchong(a2,3);
		System.out.print("去重结果：");
		for(int i:b) {
			//输出去重结果
			if(i>-10000)
			System.out.print(i+" ");
		}
	}

}
