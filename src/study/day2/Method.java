package study.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 读取指定文件并输出其16进制的编码
 * @author da_fa
 * @since 2019-6-2
 */
public class Method {

	/**
	 * 传入字节数组将其打印出来
	 * @author fankangjia
	 * @param byteArray 传入值为字符数组
	 */
	public static void printHex(byte[] byteArray) {
		StringBuffer sb= new StringBuffer();
		for(byte b:byteArray) {
			sb.append(Integer.toHexString((b>>4) & 0xF));
			sb.append(Integer.toHexString(b & 0xF));
			sb.append(" ");
		}
		System.out.println(sb.toString());
		
	}
//	public static String codeString (String filename) {
//		BufferedInputStream bin=new BufferedInputStream()
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			printHex("中国".getBytes("GBK"));
			printHex("中国".getBytes("utf-8"));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String path="C:\\Users\\da_fa\\Desktop\\123.txt";
		try {
			FileInputStream fin=new FileInputStream(path);
			byte[] bytes=new byte[fin.available()];
			fin.read(bytes);
			printHex(bytes);
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
