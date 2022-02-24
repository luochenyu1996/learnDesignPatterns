package com.chenyu.abstractfactorypattern;

/**
 * 具体产品
 *
 * @author chen yu
 * @create 2022-02-11 14:58
 */
public class PcComputer extends  Computer{
    @Override
    public void productComputer() {
        System.out.println("办公电脑");

    }
}
