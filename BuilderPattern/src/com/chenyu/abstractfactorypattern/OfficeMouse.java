package com.chenyu.abstractfactorypattern;

/**
 * 具体产品
 *
 * @author chen yu
 * @create 2022-02-11 14:58
 */
public class OfficeMouse extends  Mouse{
    @Override
    public void productMouse() {
        System.out.println("办公鼠标");
    }
}
