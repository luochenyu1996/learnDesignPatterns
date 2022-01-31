package com.chenyu.templatemethodpattern.extend;

/**
 * 带有钩子函数的模板方法模式
 *
 * @author chen yu
 * @create 2021-12-10 10:37
 */
public class HookTemplateMethod {
    public static void main(String[] args) {
        HookAbstractClass tm = new HookConcreteClass();
        tm.TemplateMethod();
    }
}
