package study.week3.xml;


import java.io.File;

import java.io.StringWriter;
 

import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.Transformer;

import javax.xml.transform.TransformerConfigurationException;

import javax.xml.transform.TransformerException;

import javax.xml.transform.TransformerFactory;

import javax.xml.transform.dom.DOMSource;

import javax.xml.transform.stream.StreamResult;

   

import org.w3c.dom.Document;

import org.w3c.dom.Element;
public class XML {

	
		// TODO Auto-generated method stub
		

		   

		/**

		* 使用Java语言实现创建XML数据和输出XML数据

		* DOM方式操作和生成XML数据

		*

		* @param args

		*/

		public static void main(String[] args) {

		 

		//创建一个新的 DocumentBuilderFactory，

		//使用静态方法调用 newInstance()方法，创建一个新的实例

		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();

		 

		 

		try {

		 

		//创建一个 DocumentBuilder

		//有异常抛出，用 try catch 捕获

		DocumentBuilder builder=factory.newDocumentBuilder();

		 

		 

		//创建一个全新的 XML 文档：Document

		//（注意：使用 org.w3c.dom 包中的 Document 类）

		Document document=builder.newDocument();

		 

		 

		//先添加一个根元素：root，并指定标签：languages

		Element root=document.createElement("languages");

		//设置根元素的属性，键值对

		root.setAttribute("category", "it");

		 

		 

		Element lan1=document.createElement("lan");

		lan1.setAttribute("id", "1");

		Element name1=document.createElement("name");

		name1.setTextContent("Java");

		Element ide1=document.createElement("ide");

		ide1.setTextContent("Eclipse");

		 

		 

		Element lan2=document.createElement("lan");

		lan2.setAttribute("id", "2");

		Element name2=document.createElement("name");

		name2.setTextContent("Swift");

		Element ide2=document.createElement("ide");

		ide2.setTextContent("Xcode");

		 

		 

		Element lan3=document.createElement("lan");

		lan3.setAttribute("id", "3");

		Element name3=document.createElement("name");

		name3.setTextContent("C#");

		Element ide3=document.createElement("ide");

		ide3.setTextContent("Visual Studio");

		 

		 

		 

		//元素创建完毕后，将 name 元素和 ide 元素添加到 lan 元素中

		//使之成为 lan 元素的子节点

		//传入的是Node类型，而Element是继承自Node的，所以可以传入

		lan1.appendChild(name1);

		lan1.appendChild(ide1);

		 

		lan2.appendChild(name2);

		lan2.appendChild(ide2);

		 

		lan3.appendChild(name3);

		lan3.appendChild(ide3);

		 

		 

		 

		//同理：将 lan 添加到 root 中

		root.appendChild(lan1);

		root.appendChild(lan2);

		root.appendChild(lan3);

		 

		 

		//最后，将 root 添加到 document 中，

		//实现 XML 数据的节点一层一层包装，最终包装到 root 和 document 中

		document.appendChild(root);

		 

		 

		 

		 

		//-----------------------------------------------------------------

		//XML数据准备完成，将当前创建好的 XML 数据，通过网络以字符串的形式传递

		//（关键是：怎么将XML数据转换成字符串）

		 

		 

		//创建一个 TransformerFactory，同样通过静态方法调用类的newInstance()方法

		//获取一个新的实例

		TransformerFactory transformerFactory=TransformerFactory.newInstance();

		 

		 

		//创建一个 Transformer，可以将 XML 文档转换成其他格式

		//有异常抛出，用 try catch 捕获

		Transformer transformer=transformerFactory.newTransformer();

		 

		 

		//调用 Transformer 的 transform() 方法，传入的参数类型很奇怪

		//第一个参数（输入值）是 Source 类型，第二个参数（输出值）是 Result 类型

		//第一个参数（输入值）是固定的，由于 Source 是通过 document 来创建的，

		//传入匿名对象 new DOMSource()，DOMSource()的参数是Node类型，

		//而 Document 也是继承自Node，所以可以传入 document，将 XML 文档作为转换的源

		//

		//第二个参数（输出值）可以有2种方法，

		//第一个可以转换为字符串，第二个可以转换为文件

		//传入匿名对象 new StreamResult()，支持File输出一个文件，也支持 Writer写出

		//如果想让XML数据通过网络传播，需要转换成字符串，这就需要传入 Writer

		//先创建一个 StringWriter

		//有异常抛出，用 try catch 捕获

		StringWriter writer=new StringWriter();

		transformer.transform(new DOMSource(document), new StreamResult(writer));

		 

		 

		//最后将 StringWriter 转换为 字符串

		//输出只有一行，是纯粹的XML内容，丢失了换行符、缩进符

		System.out.println(writer.toString());

		 

		 

		//转换成文件，第二个参数的参数传入文件对象

		transformer.transform(new DOMSource(document),

		new StreamResult(new File("languages.xml")));

		 

		 

		} catch (ParserConfigurationException e) {

		e.printStackTrace();

		} catch (TransformerConfigurationException e) {

		e.printStackTrace();

		} catch (TransformerException e) {

		e.printStackTrace();

		}

		 

		 

		}

		   

		
	

}
