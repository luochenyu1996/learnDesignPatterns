package com.chenyu.builderpattern.touse;

/**
 * 具体建造者1
 *
 * @author chen yu
 * @create 2021-12-01 17:08
 */
public class ConcreteDecorator1 extends Decorator{
    public void buildWall() {
        product.setWall("w1");
    }
    public void buildTV() {
        product.setTV("TV1");
    }
    public void buildSofa() {
        product.setSofa("sf1");
    }
}
