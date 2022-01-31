package com.chenyu.templatemethodpattern;

/**
 * 具体子类
 *
 * @author chen yu
 * @create 2021-12-10 10:13
 */
public class ConcreteClass extends AbstractClass{

    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
