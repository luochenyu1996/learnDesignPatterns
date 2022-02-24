package com.chenyu.abstractfactorypattern;

/**
 * 测试类
 * @author chen yu
 * @create 2022-02-11 15:05
 */
public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        ProductFactoryA productFactoryA = new ProductFactoryA();
        productFactoryA.getComputer().productComputer();
        productFactoryA.getMouse().productMouse();
    }
}
