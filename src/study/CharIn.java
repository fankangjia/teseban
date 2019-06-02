package study;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class CharIn {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader reader = null;
		//读取
		BufferedReader br=null;
		try {
			//FileInputStream 的 read 方法每次只从文件中读入一个字节，只用FileInputStream读取一定会乱码
			try {
				reader=new InputStreamReader(new FileInputStream(new File("C:\\Users\\da_fa\\helloworld.java")),"GBK");
				br=new BufferedReader(reader);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//				br = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

//		try {
//			int buffer=' ';
//			while((buffer=reader.read())!=-1) {
//			System.out.print((char)buffer);}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
