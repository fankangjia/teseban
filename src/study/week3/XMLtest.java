package study.week3;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class XMLtest {

	public static Document createDocument() {
		   org.dom4j.Document document = DocumentHelper.createDocument();
		   Element root = document.addElement("XmlClass");
		   Element author1 =
		       root
		          .addElement("作者")
		          .addAttribute("姓名", "fkj")
		          .addAttribute("地址", "英国")
		          .addText("aaaa");
//		   Element author2 =
//		       root
//		          .addElement(author)
//		          .addAttribute(name, Bob)
//		          .addAttribute(location, US)
//		          .addText(Bob McWhirter);
		   return (Document) document;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc=createDocument();
		
		System.out.println(doc.toString());

	}

}
