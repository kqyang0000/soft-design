package com.kqyang.chapter03.factory.method.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXML2 {

    public static Object getObject() {
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document document = builder.parse(new File("src/file/factory/method/config2.xml"));
            NodeList nl = document.getElementsByTagName("className");
            Node node = nl.item(0).getFirstChild();
            String cName = "com.kqyang.chapter03.factory.method.example." + node.getNodeValue();
            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
