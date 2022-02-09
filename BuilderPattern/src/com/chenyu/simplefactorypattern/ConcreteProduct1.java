package com.chenyu.simplefactorypattern;

/**
 * 具体产品1
 *
 * @author chen yu
 * @create 2021-12-02 11:45
 */
public class ConcreteProduct1 implements Product{
    @Override
    public void show() {
        System.out.println("我是产品1");
    }
}
