package com.chenyu.factorymethodpattern;

/**
 * 具体工厂A
 *
 * @author chen yu
 * @create 2022-02-09 22:25
 */
public class ConcreteFactoryA implements Factory{
    @Override
    public Product newProduct() {
        return new ConcreteProductA();
    }
}
