package com.chenyu.proxypattern;

/**
 * 代理
 *
 * @author chen yu
 * @create 2022-02-03 12:18
 */
public class Proxy implements  Subject{
    /**
     *  代理要依赖抽象接口
     *
     */
    private Subject subject;


    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void query() {
        //代理进行增强的内容
        System.out.println("访问网页前前打开浏览器");
        subject.query();
    }
}
