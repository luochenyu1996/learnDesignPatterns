package com.chenyu.templatemethodpattern;

/**
 * @author chen yu
 * @create 2021-12-10 10:12
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}
