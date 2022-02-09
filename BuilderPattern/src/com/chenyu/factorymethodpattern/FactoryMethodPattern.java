package com.chenyu.factorymethodpattern;

/**
 * 工厂方法模式 测试类
 *
 * @author chen yu
 * @create 2022-02-09 22:17
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Product product;
        Factory factory;
        Factory testFactory = (Factory)ReadXML1.getObject("/Users/chenyu/Code/learnDesignPatterns/out/production/BuilderPattern/com/chenyu/factorymethodpattern/config.xml");
        Product product1 = testFactory.newProduct();
        product1.show();
    }

}
