package com.kqyang.chapter03.factory.method;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory af = (AbstractFactory) ReadXML1.getObject();
        Product product = af.newProduct();
        product.show();
    }
}
