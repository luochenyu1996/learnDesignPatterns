package com.chenyu.templatemethodpattern.extend;

/**
 * 含有钩子方法的具体实现子类
 *
 * @author chen yu
 * @create 2021-12-10 10:42
 */
public class HookConcreteClass extends HookAbstractClass {
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    public void HookMethod1() {
        System.out.println("钩子方法1被重写...");
    }

    @Override
    public boolean HookMethod2() {
        return false;
    }
}
