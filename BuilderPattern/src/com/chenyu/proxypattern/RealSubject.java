package com.chenyu.proxypattern;

/**
 * 具体主题
 *
 * @author chen yu
 * @create 2022-02-03 12:17
 */
public class RealSubject implements Subject{
    @Override
    public void query() {
        System.out.println("访问百度。。。");
    }
}
