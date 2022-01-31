package com.chenyu.builderpattern.touse;

/**
 * 具体建造者2
 *
 * @author chen yu
 * @create 2021-12-01 17:09
 */
public class ConcreteDecorator2 extends Decorator{

    public void buildWall() {
        product.setWall("w2");
    }
    public void buildTV() {
        product.setTV("TV2");
    }
    public void buildSofa() {
        product.setSofa("sf2");
    }
}
