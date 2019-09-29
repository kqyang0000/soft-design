package com.kqyang.chapter04.bridge.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXML {
    public static Object getObject(String args) {
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document document = builder.parse(new File("src/file/bridge/config.xml"));
            NodeList nl = document.getElementsByTagName("className");
            Node node = null;
            if ("color".equals(args)) {
                node = nl.item(0).getFirstChild();
            } else if ("bag".equals(args)) {
                node = nl.item(1).getFirstChild();
            }
            String cName = "com.kqyang.chapter04.bridge.example." + node.getNodeValue();
            Class<?> c = Class.forName(cName);
            Object o = c.newInstance();
            return o;
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
