package com.chenyu.factorymethodpattern;

/**
 * 具体产品A
 *
 * @author chen yu
 * @create 2022-02-09 22:21
 */
public class ConcreteProductA implements  Product{
    @Override
    public void show() {
        System.out.println("产品A");
    }
}
