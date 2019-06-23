package study.week3.xml.xml;

import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Sax extends DefaultHandler{
	Stack tags = new Stack();   
	
	public static void main(String args[]) {   
	
		long lasting = System.currentTimeMillis();   
		try {   
			SAXParserFactory sf = SAXParserFactory.newInstance();   
			SAXParser sp = sf.newSAXParser();   
			Sax reader = new Sax();   
			sp.parse(new InputSource(PathUtil.getClassPath("test.xml")), reader);   
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("运行时间：" + (System.currentTimeMillis() - lasting) + "毫秒");}   
	public void characters(char ch[], int start, int length) throws SAXException { 
		
		
		//System.out.println("tags="+tags+" start="+start+" length="+length+"ch="+ch.length);
		String tag = (String) tags.peek(); 
		
		//int a = ch[start];
		//System.out.println("length"+length+" 首字母"+a);
		if(length>=1 && ch[start]==10){
			//System.out.println("qname"+tag+" ch===="+(a=ch[start+1])+"ch2=="+(a=ch[start+2]));
			return;
		}
		//super.characters(ch, start, length);  
		if (tag.equals("NO")) {
		System.out.println("车牌号码：" + new String(ch, start, length));   
		}
		if (tag.equals("ADDR")) {
		System.out.println("地址:" + new String(ch, start, length));   
		}
		
		//System.out.println(new String(ch, start, length));
	}
	public void startElement(String uri,String localName,String qName,Attributes attributes) throws SAXException {   
		//System.out.println("qName="+qName);
		//System.out.println("localName="+localName);
		tags.push(qName);
		  //super.startElement(uri, localName, qName, attributes);  

     }
	public void endElement(String url, String localName, String qName)
			throws SAXException {
		//sb.delete(0,sb.length());
	}  
}