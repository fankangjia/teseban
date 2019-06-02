package study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOhelloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader fin=null;
		try {
			fin=new InputStreamReader(new FileInputStream(new File("C:\\Users\\da_fa\\helloworld.java")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("找不到文件");
			e.printStackTrace();
		}

		try {
			int buffer=' ';
					buffer=fin.read();
			while((buffer=fin.read())!=-1) {
			System.out.print((char)buffer);}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
