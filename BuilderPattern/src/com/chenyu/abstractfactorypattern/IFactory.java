package com.chenyu.abstractfactorypattern;

/**
 * 抽象工厂
 *
 * @author chen yu
 * @create 2022-02-11 14:59
 */
public interface IFactory {


    //获取计算机
    Computer getComputer();

    //获取鼠标
    Mouse getMouse();


}
