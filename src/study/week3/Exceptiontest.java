package study.week3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptiontest {


	public static String openFile() {
		return null;
		
	}
	public static String test() {
		Message mess = null;
		try {
			FileInputStream in=new FileInputStream("D://cc.txt");
			int a = in.read();
			char[] c=new char[1];
			c[0]=(char)a;
			System.out.println(c[0]);
			System.out.println("没有出现异常");
			return "step0";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			mess=new Message("\"D://cc.txt\"","找不到文件");
			System.out.println("出现异常");
			return "step1";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			mess=new Message("\"D://cc.txt\"","找不到文件");
			e.printStackTrace();
		} finally {///finally肯定会被执行
			System.out.println(mess);
			System.out.println("This is Finally");
			return "strr";
		}
	}
	public static void main(String[] args) {
		System.out.println(test());

	}

}
