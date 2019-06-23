package study.week3.xml.xml;

import java.io.*;    
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Dom {   
	public static void main(String arge[]) {   
		long lasting =System.currentTimeMillis();   
		try{   
			File f=new File(PathUtil.getClassPath("test.xml"));   
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();   
			DocumentBuilder builder=factory.newDocumentBuilder();   
			Document doc = builder.parse(f);   
			NodeList nl = doc.getElementsByTagName("car");   
			for (int i=0;i<nl.getLength();i++){   
				System.out.print("车牌号码:" + doc.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue());   
				System.out.println("车主地址:" + doc.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
			}			
			System.out.println("运行时间：" + (System.currentTimeMillis() - lasting) + "毫秒");  
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}