package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Rewrite {

	/**
	 * @author wangchunlei
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("当前环境编码格式："+System.getProperty("file.encoding"));
		System.out.println("文件路径");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try{
			FileInputStream f = new FileInputStream(s);
			InputStreamReader isr = new InputStreamReader(f,"GBK");
			BufferedReader br = new BufferedReader(isr);
			String json;
			StringBuffer sb = new StringBuffer();
			while(null!=(json=br.readLine())){
				sb.append(json+'\n');
			}	
			br.close();
			FileOutputStream writerStream = new FileOutputStream(s); 
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8"));
			writer.write(sb.toString());
			writer.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	

}
