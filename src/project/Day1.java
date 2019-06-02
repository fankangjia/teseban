package project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import api.FileInMethod;


public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInMethod method=new FileInMethod();
		Scanner reader=new Scanner(System.in);
		String filename="";
		System.out.println("请输入文件名：");
		filename=reader.next();
		InputStreamReader fin=method.getFile("C:\\Users\\da_fa\\Desktop\\"+filename);
		int b=' ';
		String word="";
		try {
			while((b=fin.read())!=-1) {
				word+=(char)b;
			}
			fin.close();
		} catch (IOException e1) {
			System.out.println("出现IO异常");
		}
		FileOutputStream fout=null;
		try {
			fout=new FileOutputStream("C:\\Users\\da_fa\\Desktop\\"+filename);
			fout.write(word.getBytes());
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("文件名输入错误！");
		} catch (IOException e) {
			System.out.println("出现IO异常");
		}
		System.out.println("文件编码修改完毕，已修改为UTF-8格式");

	}

}
