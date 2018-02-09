package com.risonsoft.pattern.abstractfactory.sample01;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtil
{
//锟矫凤拷锟斤拷锟斤拷锟节达拷XML锟斤拷锟斤拷锟侥硷拷锟斤拷锟斤拷取锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷一锟斤拷实锟斤拷锟斤拷锟斤拷
	public static Object getBean()
	{
		try
		{
			//锟斤拷锟斤拷锟侥碉拷锟斤拷锟斤拷
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("config.xml")); 
		
			//锟斤拷取锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟侥憋拷锟节碉拷
			NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
            
            //通锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷实锟斤拷锟斤拷锟襟并斤拷锟戒返锟斤拷
            Class c=Class.forName(cName);
	  	    Object obj=c.newInstance();
            return obj;
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
		}
}
