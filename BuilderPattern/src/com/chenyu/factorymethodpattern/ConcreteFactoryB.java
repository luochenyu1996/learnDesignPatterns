package com.chenyu.factorymethodpattern;

/**
 * 具体工厂B
 *
 * @author chen yu
 * @create 2022-02-09 22:26
 */
public class ConcreteFactoryB implements Factory{

    @Override
    public Product newProduct() {
        return  new ConcreteProductB();
    }
}
