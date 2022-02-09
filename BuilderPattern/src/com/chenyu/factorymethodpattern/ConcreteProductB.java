package com.chenyu.factorymethodpattern;

/**
 * 具体产品B
 *
 * @author chen yu
 * @create 2022-02-09 22:20
 */
public class ConcreteProductB  implements  Product{
    @Override
    public void show() {
        System.out.println("产品B");
    }
}
