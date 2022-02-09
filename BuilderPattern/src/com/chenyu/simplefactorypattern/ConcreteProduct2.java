package com.chenyu.simplefactorypattern;

/**
 * 具体产品2
 *
 * @author chen yu
 * @create 2021-12-02 11:44
 */
public class ConcreteProduct2 implements Product{
    @Override
    public void show() {
        System.out.println("我是产品2");
    }
}
