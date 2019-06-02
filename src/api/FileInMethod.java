package api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * 读取文件的方法合集
 * @author fankangjia
 * @since 2019-6-1
 *
 */
public class FileInMethod {

	/**
	 *  不使用buffer的读取文件的方法，文件的编码格式为GBK默认值
	 * @param filepath 文件路径
	 * @return 返回一个InputStreamReader
	 */
	public InputStreamReader getFile(String filepath) {
		// TODO Auto-generated method stub
		InputStreamReader reader = null;

		//FileInputStream 的 read 方法每次只从文件中读入一个字节，只用FileInputStream读取一定会乱码
		try {
			
			reader=new InputStreamReader(new FileInputStream(new File(filepath)),"GBK");
		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件不存在！");
			e.printStackTrace();
		}
		return reader;
	}
	/**
	 *  不使用buffer的读取文件的方法，可以指定文件编码格式
	 * @param filepath 文件路径 charset读取文件的字符编码
	 * @return 返回一个InputStreamReader
	 */
	public InputStreamReader getFile(String filepath,String charset) {
		// TODO Auto-generated method stub
		InputStreamReader reader = null;

		//FileInputStream 的 read 方法每次只从文件中读入一个字节，只用FileInputStream读取一定会乱码
		try {
			
			reader=new InputStreamReader(new FileInputStream(new File(filepath)),charset);
		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件不存在！");
			e.printStackTrace();
		}
		return reader;
	}
	/**
	 * 使用BufferedReader 的读取文件方法,默认字符编码格式为GBK
	 * @param filepath 文件路径
	 * @return 返回一个BufferedReader
	 */
	public BufferedReader getFileB(String filepath) {
		InputStreamReader reader = null;
		BufferedReader bf=null;
		//FileInputStream 的 read 方法每次只从文件中读入一个字节，只用FileInputStream读取一定会乱码
		try {
			
			reader=new InputStreamReader(new FileInputStream(new File(filepath)),"GBK");
			bf=new BufferedReader(reader);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件不存在！");
			e.printStackTrace();
		}
		return bf;
	}
	/**
	 * 使用BufferedReader 的读取文件方法,可以指定字符的编码格式
	 * @param filepath 文件路径 charset 读取文件的字符编码
	 * @return 返回一个BufferedReader
	 */
	public BufferedReader getFileB(String filepath,String charset) {
		InputStreamReader reader = null;
		BufferedReader bf=null;
		//FileInputStream 的 read 方法每次只从文件中读入一个字节，只用FileInputStream读取一定会乱码
		try {
			
			reader=new InputStreamReader(new FileInputStream(new File(filepath)),charset);
			bf=new BufferedReader(reader);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件不存在！");
			e.printStackTrace();
		}
		return bf;
	}
}
