package study.week3.xml.xml;

import java.io.*;   
import java.util.*;   

import org.dom4j.*;   
import org.dom4j.io.*;   
public class Dom4j {
	public static void main(String arge[]) {   
		long lasting = System.currentTimeMillis();   
		try {   
			File f = new File(PathUtil.getClassPath("test.xml"));   
			SAXReader reader = new SAXReader();   
			Document doc = reader.read(f);   
			Element root = doc.getRootElement();   
			Element foo;   
			for (Iterator i = root.elementIterator("car"); i.hasNext();) {   
				foo = (Element) i.next();   
				System.out.print("车牌号码:" + foo.elementText("NO"));   
				System.out.println("车主地址:" + foo.elementText("ADDR"));   
			} 
			System.out.println("运行时间：" + (System.currentTimeMillis() - lasting) + "毫秒");   
		} catch (Exception e) {   
			e.printStackTrace();
		}
	}
}