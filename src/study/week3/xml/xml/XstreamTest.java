package study.week3.xml.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import study.week3.xml.xml.vo.Car;
import study.week3.xml.xml.vo.Person;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XppDomDriver;

//jackson fastjson
public class XstreamTest {
	
	public static void main(String args[]){
		Car car = new Car();
		car.setADDR("B12345");
		car.setNO("aaaabbb中文");
		//XStream xstream = new XStream();
		XStream xstream = new XStream();
		xstream.alias("car",Car.class); 
		xstream.alias("person",Person.class); 
		xstream.aliasField("carlist", Person.class, "carList");//当xml里的tag名跟vo类中的属性名不一样时，需要给一个别名
		//xstream.autodetectAnnotations(true);
        /* XStream.setupDefaultSecurity(xstream);
         xstream.allowTypes(new Class[]{Car.class});*/
		//XML序列化
		String xml = xstream.toXML(car);
	    System.out.println(xml);
		//XML反序列化
	    car=(Car)xstream.fromXML(xml);
		System.out.println(car);
		
		
		
		//File f = new File(PathUtil.getClassPath("test.xml"));
		FileInputStream fis = null;
		StringBuffer newxml = new StringBuffer();
		try {
			fis = new FileInputStream(PathUtil.getClassPath("test.xml"));
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");   
			  BufferedReader br = new BufferedReader(isr);   
			  String line = null;
			  //利用处理流读取文件内容
			  
		    while((line=br.readLine())!=null){
		    	System.out.println(line);
		    	newxml.append(line);
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(fis.toString());
		//XML反序列化
	    Person person=(Person)xstream.fromXML(newxml.toString());
		System.out.println(person);
	}
}
