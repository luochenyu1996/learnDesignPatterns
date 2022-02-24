package com.chenyu.abstractfactorypattern;

/**
 * 具体工厂
 *
 * @author chen yu
 * @create 2022-02-11 14:59
 */
public class ProductFactoryB implements IFactory{

    @Override
    public Computer getComputer() {
         return  new PcComputer();
    }

    @Override
    public Mouse getMouse() {
        return new OfficeMouse();
    }
}
